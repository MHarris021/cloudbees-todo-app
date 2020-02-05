package org.mharris.cloudbees.todo.webapplication.controllers;

import org.mharris.cloudbees.todo.webapplication.models.Todo;
import org.mharris.cloudbees.todo.webapplication.models.TodoWrapper;
import org.mharris.cloudbees.todo.webapplication.services.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "/api")
public class ApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);

    private TodoService todoService;

    public ApiController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(path = "/api/todos")
    public List<Todo> getAllTodos(){
        return todoService.findAllTodos();
    }

    @GetMapping(path = "/api/todos/{id}")
    public Todo getTodoById(@PathVariable("id") String id){
        return todoService.findTodoById(id);
    }

    @DeleteMapping(path = "/api/todos/{id}")
    public void deleteTodo(@PathVariable("id") String id){
        todoService.deleteTodo(id);
    }

    @PostMapping(path = "/api/todos")
    public Todo createTodo(@RequestBody Todo todo){
        LOGGER.debug("created todo " + todo);
        return todoService.createTodo(todo);
    }

    @PutMapping(path = "/api/todos/{id}")
    public Todo updateTodo(@PathVariable("id") String id, @RequestBody Todo todo){
        LOGGER.debug("submitted todo " + todo);
        return todoService.updateTodo(id, todo);
    }
}
