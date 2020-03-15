package com.kruger.transaction.model;

public enum TRANSACTIONTYPE {

    PURCHASE_WITH_GOODS("Purchase With Goods And Service"),
    BALANCE_ENQUIRY("Balance Enquiry"),
    DEPOSIT("Deposit"),
    REFUND("Refund"),
    REVERSAL("Reversal");

    String transactionDescription;

    TRANSACTIONTYPE(String transactionDescription){
        this.transactionDescription = transactionDescription;
    }

    public static TRANSACTIONTYPE findByTransactionDescription(String byTransactionDescription) {
        for(TRANSACTIONTYPE tt:TRANSACTIONTYPE.values()) {
            if ( tt.transactionDescription.equalsIgnoreCase(byTransactionDescription))
                return tt;
        }
        return null;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }
}
