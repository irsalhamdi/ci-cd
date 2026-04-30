package com.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "helloworld";
    }

    @GetMapping("/ci-cd")
    public String ciCd() {
        return "ci-cd";
    }
}
