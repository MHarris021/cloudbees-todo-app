package org.mharris.cloudbees.todo.webapplication.services.clients;

import org.mharris.cloudbees.todo.webapplication.models.Todo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "todo-rest-service")
public interface TodoRestServiceClient {

    @GetMapping(path = "/")
    CollectionModel<Todo> findAllTodos();
}
