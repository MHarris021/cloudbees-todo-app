package org.mharris.cloudbees.todo.webapplication.services.clients;

import org.mharris.cloudbees.todo.webapplication.models.Todo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "todo-rest-service")
public interface TodoRestServiceClient {

    @GetMapping(path = "/todos")
    CollectionModel<Todo> findAllTodos();

    @GetMapping(path = "/todos/{id}")
    EntityModel<Todo> findTodoById(@PathVariable("id") String id);

    @DeleteMapping(path = "/todos/{id}")
    void deleteTodo(@PathVariable("id") String id);


    @PostMapping(path = "/todos")
    EntityModel<Todo> saveTodo(Todo todo);

    @PutMapping(path = "/todos/{id}")
    EntityModel<Todo> updateTodo(@PathVariable("id") String id, Todo todo);
}
