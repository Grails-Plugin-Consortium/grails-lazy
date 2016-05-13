package org.grails.demo

import org.grails.demo.services.FooService

class FooController {

    FooService fooService

    def index() {
        render fooService.getName()
    }
}
