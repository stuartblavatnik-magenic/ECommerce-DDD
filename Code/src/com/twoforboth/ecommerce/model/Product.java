package com.twoforboth.ecommerce.model;

import lombok.Data;

public @Data class Product {
    Long id;
    String name;
    String description;
    Double price;
    Long quantity;

}
