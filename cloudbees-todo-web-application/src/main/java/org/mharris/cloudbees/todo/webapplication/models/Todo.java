package org.mharris.cloudbees.todo.webapplication.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigInteger;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Todo {

    public Todo() {
    }

    private String id;
    private String text;
    private boolean completed;
}
