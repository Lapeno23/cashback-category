package ru.itpark.repository;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.itpark.domain.Category;

import java.util.List;


@Repository
public class CategoryRepository {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public CategoryRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Category> findByCardId(Long bankId, Long cardId) {
        return jdbcTemplate.query(
                "SELECT * FROM category c JOIN cards_category cc ON cc.category_id = c.id" +
                        " WHERE cc.card_id=" + cardId + " AND cc.bank_id=" + bankId,
                (rs, i) -> Category.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .mcc(rs.getInt("mcc"))
                        .build()
        );
    }
}
