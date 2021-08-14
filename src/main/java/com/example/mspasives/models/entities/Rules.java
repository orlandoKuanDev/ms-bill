package com.example.mspasives.models.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class Rules {

    private String customerType;
    private boolean commissionMaintenance;

    private boolean maximumLimitMonthlyMovements;
    private Integer maximumLimitMonthlyMovementsQuantity;
}
