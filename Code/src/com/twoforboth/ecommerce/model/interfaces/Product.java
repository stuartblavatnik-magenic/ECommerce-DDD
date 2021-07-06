package com.twoforboth.ecommerce.model.interfaces;

public interface Product {
    Long getId();

    String getName();

    String getDescription();

    Double getRetailPrice();

    Double getWholesalePrice();

    Double getPrice();

    Long getQuantity();

    Boolean getIsInStock();

    Boolean getIsActive();

    Boolean getIsOnSale();

    void setId(Long id);

    void setName(String name);

    void setDescription(String description);

    void setRetailPrice(Double retailPrice);

    void setWholesalePrice(Double wholesalePrice);

    void setPrice(Double price);

    void setQuantity(Long quantity);

    void setIsInStock(Boolean isInStock);

    void setIsActive(Boolean isActive);

    void setIsOnSale(Boolean isOnSale);

    boolean equals(Object o);

    int hashCode();

    String toString();
}
