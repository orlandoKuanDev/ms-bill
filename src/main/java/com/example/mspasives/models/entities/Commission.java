package com.example.mspasives.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Document(collection = "commissions")
@Getter
@Setter
@AllArgsConstructor
public class Commission {
    @Id
    private String id;
    @NotBlank
    private String title;
    private String description;
}
