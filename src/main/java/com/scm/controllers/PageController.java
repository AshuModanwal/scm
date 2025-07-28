package com.scm.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model){
        System.out.println("Home page");
        model.addAttribute("name", "Home page");
        model.addAttribute("company","Oodles Technology");
        model.addAttribute("githubRepo", "http.github.com/ashuModanwal/scm");
        return "home";
    }



}
