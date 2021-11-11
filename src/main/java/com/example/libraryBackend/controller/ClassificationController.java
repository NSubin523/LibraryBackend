package com.example.libraryBackend.controller;

import com.example.libraryBackend.model.Classification;
import com.example.libraryBackend.services.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classifications")
public class ClassificationController {

    @Autowired
    private ClassificationService service;

    @GetMapping
    public List<Classification> getClassifications(){
        return service.getAllClassification();
    }
}
