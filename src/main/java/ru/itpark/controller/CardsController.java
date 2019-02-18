package ru.itpark.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itpark.service.CardsService;


@Controller
@RequestMapping("/banks/{bankId}")
@RequiredArgsConstructor
public class CardsController {
    private final CardsService cardsService;

    @GetMapping
    public String findByBankId(@PathVariable("bankId") Long id, Model model) {
        model.addAttribute("cards", cardsService.findByBankId(id));
        return "cards";
    }
}