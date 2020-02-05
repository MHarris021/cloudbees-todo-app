package org.mharris.cloudbees.todo.restservice

import org.mharris.cloudbees.todo.restservice.models.Todo
import org.mharris.cloudbees.todo.restservice.repositories.TodoRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class TodoLoader implements CommandLineRunner{
    private TodoRepository repository

    TodoLoader(TodoRepository repository) {
        this.repository = repository
    }

    @Override
    void run(String... args) throws Exception {
        if(repository.count() ==0) {
            repository.save(new Todo("Nail Technical Questions"))
            repository.save(new Todo("Nail Technical Presentation"))
            repository.save(new Todo("Celebrate!!!"))
        }
    }
}
