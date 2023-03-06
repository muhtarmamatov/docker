package com.knote.repository;

import com.knote.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotesRepository extends MongoRepository<Note, String> {
}
