package com.kruger.transaction.controller;

import com.kruger.transaction.model.Transaction;
import com.kruger.transaction.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<Transaction> getAll() {
        return transactionService.findAll();
    }

    @GetMapping("/{transactionId}")
    public Transaction getTransactionById(@PathVariable("transactionId") long id) {
        return transactionService.findByTransactionId(id);
    }


}
