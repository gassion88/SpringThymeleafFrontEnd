package com.gassion.SpringFront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/language")
public class LanguageController {
    @GetMapping("/new")
    public String createLanguage() {
        return "language/new";
    }
}
