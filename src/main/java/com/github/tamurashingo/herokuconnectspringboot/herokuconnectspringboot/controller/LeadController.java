package com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot.controller;


import com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot.model.Lead;
import com.github.tamurashingo.herokuconnectspringboot.herokuconnectspringboot.service.LeadService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LeadController {

    private final LeadService service;

    public LeadController(final LeadService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getAllLeads(Model model) throws Exception {
        List<Lead> leads = this.service.findAll();
        model.addAttribute("leads", leads);
        return "lead/index";
    }
}
