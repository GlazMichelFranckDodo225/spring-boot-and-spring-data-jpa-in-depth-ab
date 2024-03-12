package com.dgmf.service.impl;

import com.dgmf.FirstClass;
import com.dgmf.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {
    private FirstClass firstClass;
    private Environment environment;

    @Override
    public String tellAStory() {
        return "The Dependency is Saying " + firstClass.sayHello();
    }

    @Override
    public String getJavaVersion() {
        return environment.getProperty("java.version");
    }

    @Override
    public String getOsName() {
        return environment.getProperty("os.name");
    }

    @Override
    public String readProperty() {
        return environment.getProperty("custom.property");
    }

    @Autowired
    public void setFirstClass(@Qualifier("secondBean") FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
