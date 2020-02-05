package org.mharris.cloudbees.todo.webapplication.controllers;

import org.mharris.cloudbees.todo.webapplication.models.Todo;
import org.mharris.cloudbees.todo.webapplication.services.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "/api")
public class ApiController {

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
    public Todo createTodo(String text){
        return todoService.createTodo(text);
    }

    @PutMapping(path = "/api/todos/{id}")
    public Todo updateTodo(@PathVariable("id") String id, Todo todo){
        return todoService.updateTodo(id, todo);
    }
}
