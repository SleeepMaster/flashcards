package com.example.application.backend.repository;

import com.example.application.backend.entity.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashcardRepository extends JpaRepository<Flashcard, Long> {

}
