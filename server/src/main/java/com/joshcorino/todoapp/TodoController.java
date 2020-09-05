package com.joshcorino.todoapp;


import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
class TodoController {

    private TodoRepository repository;

    public TodoController(TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/todo")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Todo> todos() {
        return repository.findAll().stream().collect(Collectors.toList());
    }

}