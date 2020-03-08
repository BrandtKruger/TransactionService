package com.kruger.transaction.service;

import com.kruger.transaction.model.Transaction;
import com.kruger.transaction.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> findTransactionsByCardNumber(String cardNumber){
        return transactionRepository.findTransactionsByCardNumber(cardNumber);
    }

    public List<Transaction> findTransactionByMerchantId(String merchantId){
        return transactionRepository.findTransactionByMerchantId(merchantId);
    }

    public List<Transaction> findTransactionByTerminalId(String terminalId){
        return transactionRepository.findTransactionByTerminalId(terminalId);
    }

    public List<Transaction> findTransactionByPosIdAndOperatorId(String posId, String operatorId){
        return transactionRepository.findTransactionByPosIdAndOperatorId(posId, operatorId);
    }

    public Transaction findByTransactionId(String transactionId){
        return transactionRepository.findByTransactionId(transactionId);
    }
}
