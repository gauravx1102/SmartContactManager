package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler");
        
        //Sending Data to View

        model.addAttribute("Name", "Substing Technologies");
        model.addAttribute("YouTube", "gauravx1102");
        model.addAttribute("Github", "https://github.com/gauravx1102");
        return "home";

    }

}
