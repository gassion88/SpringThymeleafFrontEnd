package com.gassion.SpringFront.controller;

import com.gassion.SpringFront.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/th")
public class ThymeleafController {
    @GetMapping
    public String getIndex(Model model) {
        User user = new User(1, "Soslan", "Gassiev",
                22, "79298119014", "soslangassity04@gmail.com", Arrays.asList("Java", "Scala", "Kotlin"));
        model.addAttribute("user", user);
        System.out.println(user.getLang());
        return "thymeleaf_front";
    }
}
