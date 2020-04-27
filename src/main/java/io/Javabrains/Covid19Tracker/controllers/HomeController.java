package io.Javabrains.Covid19Tracker.controllers;

import io.Javabrains.Covid19Tracker.Services.Covid19_DataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    Covid19_DataServices Covid19_DataServices;

 @GetMapping("/")
    public String home(Model model) {
     model.addAttribute("locationStats",Covid19_DataServices.getAllStats());
        return "home";
    }
}
