package ru.itpark.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itpark.domain.Place;
import ru.itpark.repository.PlaceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaceService {
    private final PlaceRepository placeRepository;

    public List<Place> findByCategoryId(Long categoryId) {
        return placeRepository.findByCategoryId(categoryId);
    }

}
