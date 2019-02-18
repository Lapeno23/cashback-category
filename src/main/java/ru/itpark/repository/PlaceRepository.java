package ru.itpark.repository;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.itpark.domain.Category;
import ru.itpark.domain.Place;

import java.util.List;

@Repository
public class PlaceRepository {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public PlaceRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Place> findByCategoryId(Long categoryId) {
        return jdbcTemplate.query(
                "SELECT * FROM places WHERE category_Id=" + categoryId,
                (rs, i) -> Place.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .mcc(rs.getInt("mcc"))
                        .categoryId(rs.getLong("category_Id"))
                        .build()
        );
    }
}
