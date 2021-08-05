package com.example.mspasives.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

public class Transaction {

    @Id
    private String id;

    @Field(name = "transactionType")
    private String transactionType;

    @Field(name = "transactionAmount")
    private Double transactionAmount;

    @Field(name = "account")
    private Bill bill;

    @Field(name = "description")
    private String description;

    @Field(name = "transactionDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime transactionDate = LocalDateTime.now();
}
