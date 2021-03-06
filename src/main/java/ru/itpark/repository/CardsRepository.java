package ru.itpark.repository;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.itpark.domain.Card;
import java.util.List;

@Repository
public class CardsRepository {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public CardsRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Card> findByBankId(Long bankId) {
        return jdbcTemplate.query(
                "SELECT * FROM cards WHERE bank_id = " + bankId,
                (rs, i) -> Card.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .bankId(rs.getLong("bank_id"))
                        .build()
        );
    }
}
