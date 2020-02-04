package org.mharris.cloudbees.todo.restservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories


@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories
class TodoRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoRestServiceApplication.class)
    }

}
