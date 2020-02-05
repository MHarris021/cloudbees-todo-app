package org.mharris.cloudbees.todo.restservice.repositories

import org.mharris.cloudbees.todo.restservice.models.Todo
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface TodoRepository extends CrudRepository<Todo, String> {

}