CREATE TABLE IF NOT EXISTS FLASHCARDS (
id INT PRIMARY KEY,
term VARCHAR(930)
definition VARCHAR(1850)
);

CREATE TABLE IF NOT EXISTS FLASHCARDSETS (
id INT PRIMARY KEY,
name VARCHAR(255)
description VARCHAR(930)
flashcard_id INT NOT NULL FOREIGN KEY REFERENCES FLASHCARDS(id)
);