package com.twoforboth.ecommerce.model.interfaces;

import com.twoforboth.ecommerce.model.impl.OrderDetailImpl;
import com.twoforboth.ecommerce.model.impl.UserImpl;

public interface Order {
    Long getId();

    UserImpl getUserImpl();

    java.util.List<OrderDetailImpl> getOrderDetailList();

    void setId(Long id);

    void setUserImpl(UserImpl userImpl);

    void setOrderDetailList(java.util.List<OrderDetailImpl> orderDetailList);

    boolean equals(Object o);

    int hashCode();

    String toString();
}
