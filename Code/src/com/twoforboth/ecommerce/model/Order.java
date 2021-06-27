package com.twoforboth.ecommerce.model;


import lombok.Data;

import java.util.List;

public @Data
class Order {
    private Long id;
    private Long userId;
    private List<OrderDetail> orderDetailList;
}
