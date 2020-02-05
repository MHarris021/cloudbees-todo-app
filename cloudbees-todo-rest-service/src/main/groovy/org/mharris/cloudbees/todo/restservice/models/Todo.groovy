package org.mharris.cloudbees.todo.restservice.models

import org.springframework.data.mongodb.core.mapping.Document


@Document
class Todo {
    String id
    String text
    boolean completed

    Todo() {
    }

    Todo(String text) {
        this.text = text
    }
}
