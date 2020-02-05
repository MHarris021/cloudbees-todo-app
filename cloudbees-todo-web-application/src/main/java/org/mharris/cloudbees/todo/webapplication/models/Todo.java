package org.mharris.cloudbees.todo.webapplication.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigInteger;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Todo {
    private BigInteger id;
    private String text;
}
