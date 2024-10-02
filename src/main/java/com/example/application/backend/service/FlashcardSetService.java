package com.example.application.backend.service;

import com.example.application.backend.entity.FlashcardSet;
import com.example.application.backend.repository.FlashcardRepository;
import com.example.application.backend.repository.FlashcardSetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@AllArgsConstructor
@Service
public class FlashcardSetService {
    private static final Logger LOGGER = Logger.getLogger(FlashcardSetService.class.getName());
    private final FlashcardSetRepository flashcardSetRepository;
    private final FlashcardRepository flashcardRepository;

    public List<FlashcardSet> findAll() {
        return flashcardSetRepository.findAll();
    }

    public long count() {
        return flashcardSetRepository.count();
    }

    public void delete(FlashcardSet flashcardSet) {
        flashcardSetRepository.delete(flashcardSet);
    }

    public void save(FlashcardSet flashcardSet) {

        if (flashcardSet == null) {
            LOGGER.log(Level.SEVERE,
                    "FlashcardSet is null. Are you sure you have connected your form to the application?");
            return;
        }
        flashcardSetRepository.save(flashcardSet);

    }


}
