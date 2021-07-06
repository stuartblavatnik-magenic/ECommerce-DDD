package com.twoforboth.ecommerce.model.impl;

import lombok.Data;

import java.util.Date;

public @Data
class PaymentDetailsImpl implements com.twoforboth.ecommerce.model.interfaces.PaymentDetails {

    private Long id;
    private PaymentDetailsImpl paymentDetail;
    private String cardNumber;
    private Date expirationDate;

}
