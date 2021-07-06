package com.twoforboth.ecommerce.model.impl;

import com.twoforboth.ecommerce.model.interfaces.PaymentDetails;
import lombok.Data;

import java.util.Date;

public @Data
class PaymentDetailsImpl implements PaymentDetails {

    private Long id;
    private PaymentDetails paymentDetails;
    private String cardNumber;
    private Date expirationDate;

}
