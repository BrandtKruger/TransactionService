package com.kruger.transaction.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Transaction {

    @Id
    private Long transactionId;
    private String nameOnCard;
    @Length(min = 16, max = 19)
    private String cardNumber;
    @Length(min = 4, max = 4)
    private String expDate;
    @Length(min = 3, max = 3)
    private String cvv;

}
