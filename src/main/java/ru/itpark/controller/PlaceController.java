package ru.itpark.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itpark.service.PlaceService;

@Controller
@RequestMapping(value = "/places", method = RequestMethod.POST)
@RequiredArgsConstructor
public class PlaceController {
    private final PlaceService placeService;

    @GetMapping
    public String get(@RequestParam("categoryId") Long categoryId, Model model) {
        model.addAttribute("places", placeService.findByCategoryId(categoryId));
        return "place";
    }
}
