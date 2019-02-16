package ru.itpark.service;

import org.springframework.stereotype.Service;
import ru.itpark.domain.Bank;
import ru.itpark.repository.BanksRepository;

import java.util.List;

@Service
public class BanksService {
    private final BanksRepository banksRepository;

    public BanksService(BanksRepository banksRepository) {
        this.banksRepository = banksRepository;
    }

    public List<Bank> findAll() {
        return banksRepository.findAll();
    }
}
