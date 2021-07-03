package com.twoforboth.ecommerce.model;

import lombok.Data;

import java.util.Date;

public @Data
class PaymentDetails {

    private Long id;
    private PaymentDetails paymentDetail;
    private String cardNumber;
    private Date expirationDate;

}
