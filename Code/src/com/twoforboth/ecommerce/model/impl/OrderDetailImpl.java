package com.twoforboth.ecommerce.model.impl;

import com.twoforboth.ecommerce.model.enums.OrderAction;
import com.twoforboth.ecommerce.model.interfaces.OrderDetail;
import com.twoforboth.ecommerce.model.interfaces.PaymentDetails;
import com.twoforboth.ecommerce.model.interfaces.Product;
import com.twoforboth.ecommerce.model.interfaces.Recipient;
import lombok.Data;

import java.util.Date;

@Data
public class OrderDetailImpl implements OrderDetail {
    private Product product;
    private OrderAction orderAction;
    private Date actionDate;
    private Double orderPrice;
    private Recipient recipient;
    private PaymentDetails paymentDetails;
}
