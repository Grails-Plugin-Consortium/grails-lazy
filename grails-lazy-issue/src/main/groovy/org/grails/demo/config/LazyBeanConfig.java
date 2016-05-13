package org.grails.demo.config;

import org.grails.demo.beans.SampleBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class LazyBeanConfig {

    private static final Logger logger = LoggerFactory.getLogger(LazyBeanConfig.class);

    @Lazy
    @Bean
    SampleBean sampleBean() {
        logger.info("~~~~~~~~~ Wiring up the sample bean now ~~~~~~~~~~");
        return new SampleBean();
    }
}
