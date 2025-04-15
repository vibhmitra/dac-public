package com.vibhmitra.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet() {
        return "Hello People!";
    }

    @RequestMapping("/about")
    public String about() {
        return "This is my about us.";
    }
}
