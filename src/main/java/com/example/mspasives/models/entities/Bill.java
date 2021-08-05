package com.example.mspasives.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Document(collection = "bills")
@Getter
@Setter
@AllArgsConstructor
public class Bill {
    @Id
    private String id;
    @NotBlank
    private String code;
    private String iban;
    @Valid
    private BillType billType;
}
