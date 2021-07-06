package com.twoforboth.ecommerce.model.interfaces;

import java.util.Date;

public interface PaymentDetails {
    Long getId();

    PaymentDetails getPaymentDetails();

    String getCardNumber();

    Date getExpirationDate();

    void setId(Long id);

    void setPaymentDetails(PaymentDetails paymentDetails);

    void setCardNumber(String cardNumber);

    void setExpirationDate(Date expirationDate);

    boolean equals(Object o);

    int hashCode();

    String toString();
}
