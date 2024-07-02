package com.example.spring_data_jpa_2024.repositories;

import com.example.spring_data_jpa_2024.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<BookModel, UUID> {
}