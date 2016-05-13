package org.grails.demo.services;

import org.grails.demo.beans.SampleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class FooService {

    @Autowired
    @Lazy
    SampleBean sampleBean;

    public String getName() {
        return sampleBean.getName();
    }
}
