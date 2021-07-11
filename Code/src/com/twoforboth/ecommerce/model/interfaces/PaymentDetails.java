package com.twoforboth.ecommerce.model.interfaces;

import com.twoforboth.ecommerce.model.enums.PaymentTypes;

import java.util.Date;

public interface PaymentDetails {
    Long getId();

    PaymentTypes getPaymentType();

    String getCardNumber();

    Date getExpirationDate();

    void setId(Long id);

    void setPaymentType(PaymentTypes paymentType);

    void setCardNumber(String cardNumber);

    void setExpirationDate(Date expirationDate);

    boolean equals(Object o);

    int hashCode();

    String toString();
}
