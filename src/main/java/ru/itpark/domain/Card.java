package ru.itpark.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Card {
    private int id;
    private String name;
    private Long bankId;
}
