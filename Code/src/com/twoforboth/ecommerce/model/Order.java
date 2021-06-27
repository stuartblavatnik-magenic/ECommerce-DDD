package com.twoforboth.ecommerce.model;

import java.util.Date;

public class Order {
    private Long id;
    private Long userId;
    private Long productId;
    private OrderAction orderAction;
    private Date actionDate;
}
