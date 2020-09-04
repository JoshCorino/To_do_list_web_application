package com.joshcorino.todoapp;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Data
public class Todo {
    @Id @GeneratedValue
    private Long id;
    private @NonNull String name;
    private String description;

    public Todo(String name, String description){
        this.name=name;
        this.description=description;
    }

    public Todo(){
        this.name="";
        this.description="";
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}