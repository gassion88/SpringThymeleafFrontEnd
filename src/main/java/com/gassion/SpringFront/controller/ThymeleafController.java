package com.gassion.SpringFront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/th")
public class ThymeleafController {
    @GetMapping
    public String getIndex() {
        return "thymeleaf_front";
    }

}
