package com.example.mspasives.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

public class Retire {
    @Field(name = "account")
    private Bill bill;

    @Field(name = "amount")
    private Double amount;

    @Field(name = "description")
    private String description;

    @Field(name = "withdrawalDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime retireDate;
}
