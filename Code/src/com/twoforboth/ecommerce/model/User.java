package com.twoforboth.ecommerce.model;

import lombok.Data;

import java.util.Date;

public @Data
class User {
    private Long id;
    private String name;
    private Boolean isEnabled;
    private Date created;
}
