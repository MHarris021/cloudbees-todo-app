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
    public Todo findTodoById(String id) {
        return todoRestServiceClient.findTodoById(id).getContent();
    }

    @Override
    public Todo createTodo(String text) {
        Todo todo = new Todo();
        todo.setText(text);
        return todoRestServiceClient.saveTodo(todo).getContent();
    }

    @Override
    public List<Todo> findAllTodos() {
        return new ArrayList<>(todoRestServiceClient.findAllTodos().getContent());
    }

    @Override
    public Todo updateTodo(String id, Todo todo) {
        return todoRestServiceClient.updateTodo(id, todo).getContent();
    }

    @Override
    public void deleteTodo(String id) {
        todoRestServiceClient.deleteTodo(id);
    }

}
