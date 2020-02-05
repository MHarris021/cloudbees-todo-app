package org.mharris.cloudbees.todo.webapplication.services;

import org.mharris.cloudbees.todo.webapplication.models.Todo;

import java.math.BigInteger;
import java.util.List;

public interface TodoService {

    Todo findTodoById(String id);

    Todo createTodo(String text);

    List<Todo> findAllTodos();

    Todo updateTodo(String id, Todo todo);

    void deleteTodo(String id);


}
