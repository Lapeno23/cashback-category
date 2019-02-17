package ru.itpark.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itpark.service.BanksService;

@Controller
@RequestMapping("/banks")
@RequiredArgsConstructor
public class BanksController {
    private final BanksService banksService;

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("banks", banksService.findAll());
        return "banks";
    }



}
