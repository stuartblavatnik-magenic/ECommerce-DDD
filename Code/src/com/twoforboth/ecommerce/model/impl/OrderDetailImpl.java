package com.twoforboth.ecommerce.model.impl;

import com.twoforboth.ecommerce.model.enums.OrderAction;
import lombok.Data;

import java.util.Date;

@Data
public class OrderDetailImpl implements com.twoforboth.ecommerce.model.interfaces.OrderDetail {
    private Long productId;
    private OrderAction orderAction;
    private Date actionDate;
    private Double orderPrice;
    private Long recipientId;
}
