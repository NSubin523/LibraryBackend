package com.example.libraryBackend.repository;

import com.example.libraryBackend.model.Classification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassificationRepo extends JpaRepository<Classification,Integer> {
}
