package com.kruger.transaction.controller;

import com.kruger.transaction.model.TRANSACTIONTYPE;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class TransactionDto extends RepresentationModel {

    private Long transactionId;
    private String nameOnCard;
    private String cardNumber;
    private long amount;
    private long amountOther;
    private TRANSACTIONTYPE transactiontype;

}
