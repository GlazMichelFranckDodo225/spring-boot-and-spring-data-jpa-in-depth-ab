package com.dgmf.service.impl;

import com.dgmf.FirstClass;
import com.dgmf.service.FirstService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@Data
@PropertySource("classpath:custom.properties")
public class FirstServiceImpl implements FirstService {
    private final FirstClass firstClass;
    @Value("${custom.property}")
    private String customProperty;
    @Value("${my.prop}")
    private String myProp;

    public FirstServiceImpl(@Qualifier("firstBean") FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    @Override
    public String tellAStory() {
        return "The Dependency is Saying " + firstClass.sayHello();
    }
}
