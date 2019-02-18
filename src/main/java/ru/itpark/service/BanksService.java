package ru.itpark.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itpark.domain.Bank;
import ru.itpark.repository.BanksRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BanksService {
    private final BanksRepository banksRepository;

    public List<Bank> findAll() {
        return banksRepository.findAll();
    }

}