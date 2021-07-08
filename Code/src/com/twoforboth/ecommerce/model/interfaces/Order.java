package com.twoforboth.ecommerce.model.interfaces;

import java.util.List;

public interface Order {
    Long getId();

    User getUser();

    List<OrderDetail> getOrderDetailList();

    void setId(Long id);

    void setUser(User user);

    void setOrderDetailList(List<OrderDetail> orderDetailList);

    boolean equals(Object o);

    int hashCode();

    String toString();
}
