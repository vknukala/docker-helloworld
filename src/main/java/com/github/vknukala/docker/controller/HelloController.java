package com.github.vknukala.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Welcome to docker image created from Spring boot 2.5.3!!";
    }
}
