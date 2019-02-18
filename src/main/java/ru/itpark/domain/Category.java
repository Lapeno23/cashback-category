package ru.itpark.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Category {
    private int id;
    private String name;
    private int mcc;
    private int card_id;
}
