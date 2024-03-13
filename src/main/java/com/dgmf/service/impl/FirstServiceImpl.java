package com.dgmf.service.impl;

import com.dgmf.FirstClass;
import com.dgmf.service.FirstService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {
    private final FirstClass firstClass;

    public FirstServiceImpl(@Qualifier("firstBean") FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    @Override
    public String tellAStory() {
        return "The Dependency is Saying " + firstClass.sayHello();
    }
}
