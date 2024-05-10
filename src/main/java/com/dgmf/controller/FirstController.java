package com.dgmf.controller;

import com.dgmf.entity.Order;
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

    @PostMapping("/posts-order")
    public String postOrder(@RequestBody Order order) {
        return "Request Accepted and Order is : " + order.toString();
    }
}
