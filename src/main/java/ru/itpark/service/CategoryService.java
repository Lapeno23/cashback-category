package ru.itpark.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itpark.domain.Category;
import ru.itpark.repository.CategoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> findByCardId(Long bankId, Long cardId) {
        return categoryRepository.findByCardId(bankId, cardId);
    }

}
