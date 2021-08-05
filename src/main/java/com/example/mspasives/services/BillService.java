package com.example.mspasives.services;

import com.example.mspasives.models.entities.Bill;
import com.example.mspasives.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class BillService implements IBillService {
    @Autowired
    private BillRepository billRepository;

    @Override
    public Mono<Bill> save(Bill request) {
        return billRepository.save(request);
    }

    @Override
    public Flux<Bill> find() {
        return billRepository.findAll();
    }

    @Override
    public Mono<Bill> findById(String id) {
        return billRepository.findById(id);
    }

    @Override
    public Mono<Bill> update(String id, Bill request) {
        return null;
    }

    @Override
    public Mono<Void> delete(Bill bill) {
        return billRepository.delete(bill);
    }
}
