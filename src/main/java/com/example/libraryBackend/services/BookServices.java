package com.example.libraryBackend.services;

import com.example.libraryBackend.model.Books;
import com.example.libraryBackend.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {

    @Autowired
    private BookRepo bookRepo;

    public List<Books> getAllBooks(){
        return bookRepo.findAll();
    }

    public Books getBookById(String id){
        return bookRepo.getById(id);
    }

    public void addBook(Books books){
        bookRepo.save(books);
    }

    public void deleteBookById(String id){
        bookRepo.deleteById(id);
    }

    public void deleteAllBook(){
        bookRepo.deleteAll();
    }
}
