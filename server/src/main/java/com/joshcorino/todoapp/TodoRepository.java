package com.joshcorino.todoapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
interface TodoRepository extends JpaRepository<Todo, Long> {

}
