package org.sda.com.fishproduct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogInController {
    @GetMapping("/login")
    public String showLogInPage(){
        return "login";
    }
}
