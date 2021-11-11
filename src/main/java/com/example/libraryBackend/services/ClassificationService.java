package com.example.libraryBackend.services;

import com.example.libraryBackend.model.Classification;
import com.example.libraryBackend.repository.ClassificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificationService {

    @Autowired
    private ClassificationRepo classificationRepo;

    public List<Classification> getAllClassification(){
        return classificationRepo.findAll();
    }

}
