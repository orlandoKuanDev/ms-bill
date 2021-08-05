package com.example.mspasives.services;

import com.example.mspasives.models.entities.Bill;
import com.example.mspasives.models.entities.BillType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IBillService {
    Mono<Bill> save(Bill request);

    Flux<Bill> find();

    Mono<Bill> findById(String id);

    Mono<Bill> update(String id, Bill request);

    Mono<Void> delete(Bill bill);
}
