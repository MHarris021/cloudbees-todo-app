package org.mharris.cloudbees.todo.discoveryservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer


@SpringBootApplication
@EnableEurekaServer
class TodoDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoDiscoveryServiceApplication.class)
    }
}