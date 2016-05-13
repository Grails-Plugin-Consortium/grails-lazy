package org.grails.demo.beans;

import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

public class SampleBean {

    private static final Logger logger = LoggerFactory.getLogger(SampleBean.class);

    public String getName(){
        return "Sample Bean";
    }

    @PostConstruct
    void postConstruct(){
        logger.info("\n\n\n~~~~~~~~~~ In Post construct! ~~~~~~~~~\n\n\n");
    }
}
