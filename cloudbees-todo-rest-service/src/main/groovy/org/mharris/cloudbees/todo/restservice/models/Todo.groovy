package org.mharris.cloudbees.todo.restservice.models

import org.springframework.data.mongodb.core.mapping.Document


@Document
class Todo {
    BigInteger id
    String text
}
