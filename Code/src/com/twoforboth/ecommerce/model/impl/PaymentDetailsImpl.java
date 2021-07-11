package com.twoforboth.ecommerce.model.impl;

import com.twoforboth.ecommerce.model.enums.PaymentTypes;
import com.twoforboth.ecommerce.model.interfaces.PaymentDetails;
import lombok.Data;

import java.util.Date;

public @Data
class PaymentDetailsImpl implements PaymentDetails {

    private Long id;
    private PaymentTypes paymentType;
    private String cardNumber;
    private Date expirationDate;

}
