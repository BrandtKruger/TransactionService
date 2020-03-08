package com.kruger.transaction.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id", nullable = false)
    private Long transactionId;
    @Column(name = "name_on_card", nullable = false)
    private String nameOnCard;
    @Column(name = "card_number", nullable = false)
    @Length(min = 16, max = 19)
    private String cardNumber;
    @Column(name = "exp_date", nullable = false)
    @Length(min = 4, max = 4)
    private String expDate;
    @Column(name = "cvv", nullable = false)
    @Length(min = 3, max = 3)
    private String cvv;
    @Column(name = "amount", nullable = false)
    private long amount;
    @Column(name = "amount_other", nullable = false)
    private long amountOther;

}
