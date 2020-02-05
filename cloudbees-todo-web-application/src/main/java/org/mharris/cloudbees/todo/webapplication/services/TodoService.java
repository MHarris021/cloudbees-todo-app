package org.mharris.cloudbees.todo.webapplication.services;

import org.mharris.cloudbees.todo.webapplication.models.Todo;

import java.math.BigInteger;
import java.util.List;

public interface TodoService {

    Todo findTodoById(BigInteger id);

    Todo createTodo(String text);

    List<Todo> findAllTodos();

    Todo updateTodo(Todo todo);

    void deleteTodo(Todo todo);

    long countTodos();

}
