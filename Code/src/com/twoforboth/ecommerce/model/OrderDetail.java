package com.twoforboth.ecommerce.model;

import lombok.Data;

import java.util.Date;

@Data
public class OrderDetail {
    private Long productId;
    private OrderAction orderAction;
    private Date actionDate;
    private Double orderPrice;
    private Long recipientId;
}
