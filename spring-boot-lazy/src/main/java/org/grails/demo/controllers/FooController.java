package org.grails.demo.controllers;

import org.grails.demo.services.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @Autowired
    @Lazy
    FooService fooService;

    @RequestMapping("/foo/index")
    public String fooIndex(){
        return fooService.getName();
    }

    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }
}
