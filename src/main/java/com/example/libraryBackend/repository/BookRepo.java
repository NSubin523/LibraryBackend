package com.example.libraryBackend.repository;

import com.example.libraryBackend.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Books,String> {
}
