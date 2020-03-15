package com.kruger.transaction.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class TransactionConverter implements AttributeConverter<TRANSACTIONTYPE, String> {

    @Override
    public String convertToDatabaseColumn(TRANSACTIONTYPE region) {
        return region.transactionDescription;
    }

    @Override
    public TRANSACTIONTYPE convertToEntityAttribute(String s) {
        return  TRANSACTIONTYPE.findByTransactionDescription(s);
    }

}
