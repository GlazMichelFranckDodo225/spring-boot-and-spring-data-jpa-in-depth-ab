package com.dgmf;

// @Component
public class FirstClass {
    private String myVar;

    public FirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello() {
        return "Hello Spring People ! ==> myVar = " + myVar;
    }
}
