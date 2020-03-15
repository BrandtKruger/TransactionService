package com.kruger.transaction.repository;

import com.kruger.transaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    @Query("SELECT * FROM transaction WHERE cardNumber= $1")
    public List<Transaction> findTransactionsByCardNumber(String cardNumber);

    @Query("SELECT * FROM transaction WHERE merchantId= $1")
    public List<Transaction> findTransactionByMerchantId(String merchantId);

    @Query("SELECT * FROM transaction WHERE terminalId= $1")
    public List<Transaction> findTransactionByTerminalId(String terminalId);

    @Query("SELECT * FROM transaction WHERE posId = $1 AND operatorId= $2")
    public List<Transaction> findTransactionByPosIdAndOperatorId(String posId, String operatorId);

    @Query("SELECT * FROM transaction WHERE transactionId = $1")
    public Transaction findByTransactionId(long transactionId);
}
