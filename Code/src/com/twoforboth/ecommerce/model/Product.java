package com.twoforboth.ecommerce.model;

import lombok.Data;

public @Data class Product {
    Long id;
    String name;
    String description;
    Double retailPrice;
    Double wholesalePrice;
    Double price;
    Long quantity;
    Boolean isInStock;
    Boolean isActive;
    Boolean isOnSale;
}
