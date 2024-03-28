package com.dgmf.a.restapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
