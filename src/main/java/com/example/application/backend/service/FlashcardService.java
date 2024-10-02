package com.example.application.backend.service;

import com.example.application.backend.entity.Flashcard;
import com.example.application.backend.repository.FlashcardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@AllArgsConstructor
@Service
public class FlashcardService {
    private static final Logger LOGGER = Logger.getLogger(FlashcardService.class.getName());
    private final FlashcardRepository flashcardRepository;

    public List<Flashcard> findAll() {
        return flashcardRepository.findAll();
    }

    public long count() {
        return flashcardRepository.count();
    }

    public void delete(Flashcard flashcard) {
        flashcardRepository.delete(flashcard);
    }

    public void save(Flashcard flashcard) {

        if (flashcard == null) {
            LOGGER.log(Level.SEVERE,
                    "Flashcard is null. Are you sure you have connected your form to the application?");
            return;
        }
        flashcardRepository.save(flashcard);

    }

}
