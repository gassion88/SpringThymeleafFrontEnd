package com.gassion.SpringFront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/developer")
public class DeveloperController {
    @GetMapping("/new")
    public String createDeveloper() {
        return "developer/new";
    }
}
