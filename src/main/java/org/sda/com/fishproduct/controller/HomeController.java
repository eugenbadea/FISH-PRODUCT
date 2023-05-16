package org.sda.com.fishproduct.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping(value ={"/","/index","/home"})
    public String showIndexPage(){
        return "index";
    }
}
