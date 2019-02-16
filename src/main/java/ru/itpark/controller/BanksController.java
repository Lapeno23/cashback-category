package ru.itpark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itpark.service.BanksService;

@Controller
@RequestMapping("/banks")
public class BanksController {
    private final BanksService banksService;

    public BanksController(BanksService banksService) {
        this.banksService = banksService;
    }

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("banks", banksService.findAll());
        return "banks";
    }
}
