package com.twoforboth.ecommerce.model;

import lombok.Data;

public @Data class Recipient {

    Long id;
    String name;
    String address;
    String phoneNumber;
}
