package ru.itpark.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itpark.domain.Card;
import ru.itpark.repository.CardsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardsService {
    private final CardsRepository cardsRepository;

    public List<Card> findByBankId(Long bankId) {
        return cardsRepository.findByBankId(bankId);
    }
}
