package com.dgmf;

// @Component
public class HelloWorld {
    private String myVar;

    public HelloWorld(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello() {
        return "Hello Spring People ! ==> myVar = " + myVar;
    }
}
