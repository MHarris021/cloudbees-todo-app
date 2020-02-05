package org.mharris.cloudbees.todo.webapplication.services;

import org.mharris.cloudbees.todo.webapplication.models.Todo;
import org.mharris.cloudbees.todo.webapplication.services.clients.TodoRestServiceClient;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private TodoRestServiceClient todoRestServiceClient;

    public TodoServiceImpl(TodoRestServiceClient todoRestServiceClient) {
        this.todoRestServiceClient = todoRestServiceClient;
    }

    @Override
    public Todo findTodoById(BigInteger id) {
        return null;
    }

    @Override
    public Todo createTodo(String text) {
        return null;
    }

    @Override
    public List<Todo> findAllTodos() {
        return new ArrayList<>(todoRestServiceClient.findAllTodos().getContent());
    }

    @Override
    public Todo updateTodo(Todo todo) {
        return null;
    }

    @Override
    public void deleteTodo(Todo todo) {

    }

    @Override
    public long countTodos() {
        return 0;
    }
}
