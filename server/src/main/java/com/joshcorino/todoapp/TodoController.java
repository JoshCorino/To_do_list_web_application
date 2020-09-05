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
        // ArrayList<Todo> todos = ( ArrayList<Todo>) repository.findAll().stream()
        //         .collect(Collectors.toList());
        return repository.findAll().stream().collect(Collectors.toList());
        // HashMap<String, ArrayList<Todo>> aux =new HashMap<String, ArrayList<Todo>>();

        // for(Todo t:todos){
        //     ArrayList<Todo> before =new ArrayList<Todo>();
        //     if(aux.get(t.getFolder())!=null) {
        //         before = aux.get(t.getFolder());
        //     }
        //     before.add(t);
        //     aux.put(t.getFolder(),before);
        // }
        // ArrayList<String> output = new ArrayList<String>();
        // JSONObject json = new JSONObject();

        // for (String f:aux.keySet()) {
        //     json = new JSONObject();

        //     json.put("folder", aux.get(f).get(0).getFolder());

        //     JSONArray array = new JSONArray();

        //     for(Todo t:todos){
        //         JSONArray folderTodo = new JSONArray();
        //         JSONObject item = new JSONObject();
        //         item.put("name", t.getName());
        //         item.put("description", t.getDescription());
        //         array.add(folderTodo);

        //     }
        //     json.put("folderTodos", array);
        // }

        // output.add(json.toString());
        // return output;
    }
}