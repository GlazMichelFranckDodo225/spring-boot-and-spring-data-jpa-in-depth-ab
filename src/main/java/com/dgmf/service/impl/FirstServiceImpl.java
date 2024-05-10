package com.dgmf.service.impl;

import com.dgmf.entity.FirstClass;
import com.dgmf.service.FirstService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

@Service
@Data
// @PropertySource("classpath:custom.properties")
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom-file-2.properties")
})
public class FirstServiceImpl implements FirstService {
    private final FirstClass firstClass;
    @Value("${custom.property}")
    private String customProperty;
    @Value("${my.prop}")
    private String myProp;
    @Value("${my.prop.2}")
    private String myPropTwo;
    @Value("${custom.property.int}")
    private Integer customPropertyInt;

    public FirstServiceImpl(
            @Qualifier("firstBean") FirstClass firstClass
    ) {
        this.firstClass = firstClass;
    }

    @Override
    public String tellAStory() {
        return "The Dependency is Saying " + firstClass.sayHello();
    }
}
