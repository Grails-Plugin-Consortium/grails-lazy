package org.grails.demo.services

import org.grails.demo.beans.SampleBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Lazy

@Lazy
class FooService {

    static initLazy = true
    static lazyInit = true

    @Autowired
    @Lazy
    SampleBean sampleBean

    def getName() {
        return sampleBean.getName()
    }
}
