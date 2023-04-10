package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    // expose "/" that return "Hello world"

    @GetMapping("/")
    public String sayHello(){
        return "hello world!";
    }
}