package com.spring.docker.compose.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String add(){
        return "Hello World";
    }

    @RequestMapping(value = "/edit/view", method = RequestMethod.POST)
    public String edit(){return null;}
}
