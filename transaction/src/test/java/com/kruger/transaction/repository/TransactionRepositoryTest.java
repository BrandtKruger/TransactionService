package com.kruger.transaction.repository;

import com.kruger.transaction.model.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
public class TransactionRepositoryTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private TransactionRepository transactionRepository;

    @Test
    public void findTransactionsByCardNumber() {

        final String testCardNumber = "4076543976134679";
        final String testName = "BDG Kruger";
        final String testCvv = "321";
        final String testExpDate = "1224";
        final long testAmount = 3456;
        final long testAmountOther = 0;

        Transaction transaction = Transaction.builder().nameOnCard(testName).cardNumber(testCardNumber)
                .expDate(testExpDate).cvv(testCvv).amount(testAmount).amountOther(testAmountOther).build();

        transactionRepository.save(transaction);

        entityManager.persist(transaction);

        List<Transaction> transactions = transactionRepository.findTransactionsByCardNumber(testCardNumber);
        assertEquals(1, transactions.size());
        assertThat(transactions).extracting(Transaction::getCardNumber).containsOnly(testCardNumber);
    }
}
