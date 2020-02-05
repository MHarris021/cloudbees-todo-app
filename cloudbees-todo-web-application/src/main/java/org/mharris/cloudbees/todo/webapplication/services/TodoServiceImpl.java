package org.mharris.cloudbees.todo.webapplication.services;

import org.mharris.cloudbees.todo.webapplication.models.Todo;
import org.mharris.cloudbees.todo.webapplication.services.clients.TodoRestServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TodoServiceImpl.class);

    private TodoRestServiceClient todoRestServiceClient;

    public TodoServiceImpl(TodoRestServiceClient todoRestServiceClient) {
        this.todoRestServiceClient = todoRestServiceClient;
    }

    @Override
    public Todo findTodoById(String id) {
        return todoRestServiceClient.findTodoById(id).getContent();
    }

    @Override
    public Todo createTodo(Todo todo) {
        return todoRestServiceClient.saveTodo(todo).getContent();
    }

    @Override
    public List<Todo> findAllTodos() {
        List<Todo> todos = new ArrayList<>(todoRestServiceClient.findAllTodos().getContent());
        return todos;
    }

    @Override
    public Todo updateTodo(String id, Todo todo) {

        LOGGER.debug("initial todo" +String.valueOf(todo));
        Todo todo1 = todoRestServiceClient.updateTodo(id, todo).getContent();
        LOGGER.debug("returned todo" +String.valueOf(todo1));
    return todo1;
    }

    @Override
    public void deleteTodo(String id) {
        todoRestServiceClient.deleteTodo(id);
    }

}
