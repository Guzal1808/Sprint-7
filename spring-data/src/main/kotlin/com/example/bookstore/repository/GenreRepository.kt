package com.example.bookstore.repository

import com.example.bookstore.entity.Genre
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GenreRepository: JpaRepository<Genre, Long> {
}