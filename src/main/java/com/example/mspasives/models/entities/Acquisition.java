package com.example.mspasives.models.entities;

import lombok.Data;

import java.util.List;

@Data
public class Acquisition {

    private Product product;

    private List<Customer> customerOwner;

    private List<Customer> authorizedSigner;

}
