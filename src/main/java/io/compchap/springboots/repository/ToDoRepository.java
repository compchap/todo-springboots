package io.compchap.springboots.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.compchap.springboots.model.ToDo;

@Repository
public interface ToDoRepository extends MongoRepository<ToDo, String> {
//	public ToDo findById(String id);
}
