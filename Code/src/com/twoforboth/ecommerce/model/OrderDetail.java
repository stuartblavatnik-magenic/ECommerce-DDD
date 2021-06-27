package com.twoforboth.ecommerce.model;

import lombok.Data;

import java.util.Date;

public @Data
class OrderDetail {
    private Long productId;
    private OrderAction orderAction;
    private Date actionDate;
}
