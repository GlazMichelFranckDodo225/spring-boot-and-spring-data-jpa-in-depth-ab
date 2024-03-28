package com.dgmf.a.restapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from FirstController";
    }
}
