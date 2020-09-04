package com.joshcorino.todoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
class TodoController {
    
    private TodoRepository repository;

    public TodoController(TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/todo")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Todo> todos() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }

    // @GetMapping("/todos/{id}")
    // @CrossOrigin(origins = "http://localhost:4200")
    // public Todo todos(@PathVariable(value = "id") Long todoId) {
    //     System.out.print("Cachie el valor "+repository.getOne(todoId).getName() );
    //     return repository.getOne(todoId);
    // }

    // @DeleteMapping("/todos/{id}")
    // @CrossOrigin(origins = "http://localhost:4200")
    // public boolean deleteId(@PathVariable(value = "id") Long todoId){
    //     try {
    //         repository.deleteById(todoId);
    //         return true;
    //     } catch (Exception e) {
    //         return false;
    //     }
    // }
}