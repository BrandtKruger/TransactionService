package com.kruger.transaction.controller;

import com.kruger.transaction.model.TRANSACTIONTYPE;
import lombok.*;

Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class BalanceEnquiryDto {
    private Long transactionId;
    private String nameOnCard;
    private String cardNumber;
    private long balanceAmount;
    private TRANSACTIONTYPE transactiontype;

}
