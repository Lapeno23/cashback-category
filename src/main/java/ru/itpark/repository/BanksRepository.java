package ru.itpark.repository;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.itpark.domain.Bank;

import java.util.List;

@Repository
public class BanksRepository {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public BanksRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Bank> findAll() {
        return jdbcTemplate.query(
                "SELECT id, name FROM banks",
                (rs, i) -> new Bank(
                        rs.getInt("id"),
                        rs.getString("name")
                )
        );
    }

}