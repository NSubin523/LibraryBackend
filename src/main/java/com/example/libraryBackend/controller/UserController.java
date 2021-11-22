package com.example.libraryBackend.controller;

import com.example.libraryBackend.model.User;
import com.example.libraryBackend.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping
    public List<User> getAllUsers(){
        return userServices.getAllUsers();
    }

    @PostMapping
    public void addNewUser(@RequestBody User user){
        userServices.addNewUser(user);
    }

    @DeleteMapping
    public void deleteUsers(){
        userServices.deleteUsers();
    }

    @RequestMapping("/{userId}")
    public User getSingleUserById(@PathVariable long userId){
        return userServices.getUserByID(userId);
    }

}
