package org.mharris.cloudbees.todo.restservice

import org.mharris.cloudbees.todo.restservice.models.Todo
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer


@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories
class TodoRestServiceApplication {

    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer(){
        return RepositoryRestConfigurer.withConfig({ config ->
            config.exposeIdsFor(Todo.class)
        })
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoRestServiceApplication.class)
    }

}
