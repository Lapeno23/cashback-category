package ru.itpark.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itpark.service.CategoryService;

@Controller
@RequestMapping(value = "/banks/{bankId}/cards/{cardId}/categories", method = RequestMethod.POST)
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;
    @GetMapping
    public String get(@PathVariable("bankId") Long bankId, @PathVariable("cardId") Long cardId, Model model) {
        model.addAttribute("category", categoryService.findByCardId(bankId, cardId));
        return "category";
    }

}
