package com.dgmf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from FirstController";
    }

    @PostMapping("/posts")
    public String post(@RequestBody String message) {
        return "Request Accepted and Message is : " + message;
    }
}
