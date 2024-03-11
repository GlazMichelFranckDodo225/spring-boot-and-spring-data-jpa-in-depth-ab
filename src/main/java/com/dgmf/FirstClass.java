package com.dgmf;

// @Component
public class FirstClass {
    private String message;

    public FirstClass(String message) {
        this.message = message;
    }

    public String sayHello() {
        return "Hello Spring People ! ==> Message = " + message;
    }
}
