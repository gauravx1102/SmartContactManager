package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handler");

        // Sending Data to View

        model.addAttribute("Name", "Substing Technologies");
        model.addAttribute("YouTube", "gauravx1102");
        model.addAttribute("Github", "https://github.com/gauravx1102");
        return "home";

    }

    // about

    @GetMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", true);
        System.out.println("Page loading");
        return "about";
    }

    // services

    @GetMapping("services")
    public String servicesPage() {
        System.out.println("Services page loading");
        return "services";
    }

    @GetMapping("contact")
    public String conatactPage() {
        System.out.println("Contact page loading");
        return "contact";
    }

    @GetMapping("/login")
    public String loginPage() {
        System.out.println("Login page loading");
        return "login";
    }

    @GetMapping("/signup")
    public String signupPage() {
        System.out.println("Login page loading");
        return "signup";
    }

}
