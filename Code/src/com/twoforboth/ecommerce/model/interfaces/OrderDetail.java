package com.twoforboth.ecommerce.model.interfaces;

import com.twoforboth.ecommerce.model.enums.OrderAction;

import java.util.Date;

public interface OrderDetail {
    Product getProduct();

    OrderAction getOrderAction();

    Date getActionDate();

    Double getOrderPrice();

    Recipient getRecipient();

    PaymentDetails getPaymentDetails();

    void setProduct(Product product);

    void setOrderAction(OrderAction orderAction);

    void setActionDate(Date actionDate);

    void setOrderPrice(Double orderPrice);

    void setRecipient(Recipient recipient);

    void setPaymentDetails(PaymentDetails paymentDetails);

    boolean equals(Object o);

    int hashCode();

    String toString();
}
