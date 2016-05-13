package grails.lazy.issue

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.grails.demo.config.LazyBeanConfig
import org.springframework.context.annotation.Import

//@Import([LazyBeanConfig])
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}