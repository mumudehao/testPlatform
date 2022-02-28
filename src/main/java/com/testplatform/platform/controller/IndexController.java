package com.testplatform.platform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping({"/","/index"})
    public String Index(){
        return "index";
    }


    @GetMapping({"/404"})
    public String E404(){
        return "404";
    }

}