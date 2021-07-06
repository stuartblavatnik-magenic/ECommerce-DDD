package com.twoforboth.ecommerce.model.interfaces;

public interface OrderDetail {
    Long getProductId();

    com.twoforboth.ecommerce.model.enums.OrderAction getOrderAction();

    java.util.Date getActionDate();

    Double getOrderPrice();

    Long getRecipientId();

    void setProductId(Long productId);

    void setOrderAction(com.twoforboth.ecommerce.model.enums.OrderAction orderAction);

    void setActionDate(java.util.Date actionDate);

    void setOrderPrice(Double orderPrice);

    void setRecipientId(Long recipientId);

    boolean equals(Object o);

    int hashCode();

    String toString();
}
