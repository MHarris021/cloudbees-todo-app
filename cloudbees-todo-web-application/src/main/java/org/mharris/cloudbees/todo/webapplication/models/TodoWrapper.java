package org.mharris.cloudbees.todo.webapplication.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TodoWrapper {

    @JsonProperty(value = "todos")
    private List<Todo> todos;

    public TodoWrapper(List<Todo> todos) {
        this.todos = todos;
    }
}
