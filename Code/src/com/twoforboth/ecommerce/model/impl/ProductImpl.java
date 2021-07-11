package com.twoforboth.ecommerce.model.impl;

import com.twoforboth.ecommerce.model.interfaces.Product;
import lombok.Data;

public @Data class ProductImpl implements Product {
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
