package com.example.libraryBackend.services;

import com.example.libraryBackend.model.User;
import com.example.libraryBackend.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public void addNewUser(User user){
        userRepo.save(user);
    }

    public void deleteUsers(){
        userRepo.deleteAll();
    }

}
