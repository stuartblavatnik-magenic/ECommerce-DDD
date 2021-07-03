package com.twoforboth.ecommerce.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

public @Data
class User {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private Boolean isEnabled;
    private Date created;
    private List<OrderDetail> orderDetails;
}
