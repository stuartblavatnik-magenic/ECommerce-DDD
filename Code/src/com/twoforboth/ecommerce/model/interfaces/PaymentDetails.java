package com.twoforboth.ecommerce.model.interfaces;

import com.twoforboth.ecommerce.model.impl.PaymentDetailsImpl;

public interface PaymentDetails {
    Long getId();

    PaymentDetailsImpl getPaymentDetail();

    String getCardNumber();

    java.util.Date getExpirationDate();

    void setId(Long id);

    void setPaymentDetail(PaymentDetailsImpl paymentDetail);

    void setCardNumber(String cardNumber);

    void setExpirationDate(java.util.Date expirationDate);

    boolean equals(Object o);

    int hashCode();

    String toString();
}
