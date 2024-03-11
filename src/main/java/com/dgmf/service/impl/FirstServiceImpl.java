package com.dgmf.service.impl;

import com.dgmf.FirstClass;
import com.dgmf.service.FirstService;
import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {
    private FirstClass firstClass;

    @Override
    public String tellAStory() {
        return "The Dependency is Saying " + firstClass.sayHello();
    }
}
