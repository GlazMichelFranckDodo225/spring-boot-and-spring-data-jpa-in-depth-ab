package com.dgmf.service.impl;

import com.dgmf.FirstClass;
import com.dgmf.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {
    private final FirstClass firstClass;

    // @Autowired ==> Optional
    public FirstServiceImpl(@Qualifier("secondBean") FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    @Override
    public String tellAStory() {
        return "The Dependency is Saying " + firstClass.sayHello();
    }
}
