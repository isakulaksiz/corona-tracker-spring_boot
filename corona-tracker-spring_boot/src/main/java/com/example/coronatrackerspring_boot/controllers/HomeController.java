package com.example.coronatrackerspring_boot.controllers;

import com.example.coronatrackerspring_boot.models.LocationStats;
import com.example.coronatrackerspring_boot.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalCases = allStats.stream().mapToInt(stat -> stat.getTotalCases()).sum();
        model.addAttribute("locationStats",allStats);
        model.addAttribute("totalCases",totalCases);
        return "home";
    }
}
