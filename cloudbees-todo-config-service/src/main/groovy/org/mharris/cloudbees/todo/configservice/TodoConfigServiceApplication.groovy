package org.mharris.cloudbees.todo.configservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
class TodoConfigServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TodoConfigServiceApplication.class)
    }
}
