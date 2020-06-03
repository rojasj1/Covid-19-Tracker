package io.Javabrains.Covid19Tracker.controllers;

import io.Javabrains.Covid19Tracker.Services.Covid19_DataServices;
import io.Javabrains.Covid19Tracker.models.LocationStats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;
@Controller
public class HomeController {
    @Autowired
    Covid19_DataServices Covid19_DataServices;

 @GetMapping("/")
    public String home(Model model) {
	List <LocationStats> allStats = Covid19_DataServices.getAllStats();
	int TotalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
     model.addAttribute("locationStats" , allStats);
     model.addAttribute("TotalReportedCases" , TotalReportedCases);
        return "home";
    }
}
