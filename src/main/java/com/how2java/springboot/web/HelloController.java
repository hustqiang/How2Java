package com.how2java.springboot.web;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "spring boot application";
    }

}
