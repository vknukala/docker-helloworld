package com.github.vknukala.docker.controller;

import com.github.vknukala.docker.config.DockerDemoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private DockerDemoProperties dockerDemoProperties;

    @GetMapping("/")
    public String getMessage() {
        return String.format("Hello %s !! Welcome to docker world ", dockerDemoProperties.getUsername());
    }
}
