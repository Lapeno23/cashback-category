package ru.itpark.domain;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Place {
    private int id;
    private String name;
    private int mcc;
    private Long categoryId;
}
