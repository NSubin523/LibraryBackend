package com.example.libraryBackend.controller;

import com.example.libraryBackend.model.Books;
import com.example.libraryBackend.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookServices bookServices;

    @GetMapping
    public List<Books> getBooks(){
        return bookServices.getAllBooks();
    }

    @RequestMapping("/{id}")
    public Books getSingleUserById(@PathVariable String id){
        return bookServices.getBookById(id);
    }

    @PostMapping
    public void saveBook(Books books){
        bookServices.addBook(books);
    }

    @DeleteMapping
    public void deleteAll(){
        bookServices.deleteAllBook();
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable String id){
        bookServices.deleteBookById(id);
    }
}
