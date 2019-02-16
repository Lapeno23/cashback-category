package ru.itpark.repository;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.itpark.domain.Bank;

import java.sql.ResultSet;
import java.sql.SQLException;
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
                new RowMapper<Bank>() {
                    @Override
                    public Bank mapRow(ResultSet resultSet, int i) throws SQLException {
                        return new Bank(
                                resultSet.getInt("id"),
                                resultSet.getString("name")
                        );
                    }
                }
        );
    }
}
