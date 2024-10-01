package com.example.application.backend.repository;

import com.example.application.backend.entity.FlashcardSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlashcardSetRepository extends JpaRepository<FlashcardSet, Long> {

}
