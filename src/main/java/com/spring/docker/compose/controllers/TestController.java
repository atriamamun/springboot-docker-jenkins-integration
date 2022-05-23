package com.spring.docker.compose.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class TestController {
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String add(){
        return "Hello World";
    }
}
