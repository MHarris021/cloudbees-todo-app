package org.mharris.cloudbees.todo.webapplication.controllers;

import org.mharris.cloudbees.todo.webapplication.models.Todo;
import org.mharris.cloudbees.todo.webapplication.services.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/api")
public class ApiController {

    private TodoService todoService;

    public ApiController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllTodos(){
        return todoService.findAllTodos();
    }
}
