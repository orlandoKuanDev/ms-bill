package com.example.mspasives.repositories;

import com.example.mspasives.models.entities.Bill;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BillRepository extends ReactiveMongoRepository<Bill, String> {
}
