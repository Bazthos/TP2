package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";  // Retourne la vue index.html
    }

    @PostMapping("/addDocument")
    public ModelAndView addDocument(@RequestParam String content) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "Document added with content: " + content);
        return modelAndView;
    }
}
