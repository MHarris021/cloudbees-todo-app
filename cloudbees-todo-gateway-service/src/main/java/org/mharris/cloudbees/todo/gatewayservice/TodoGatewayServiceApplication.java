package org.mharris.cloudbees.todo.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class TodoGatewayServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TodoGatewayServiceApplication.class);
    }

}
