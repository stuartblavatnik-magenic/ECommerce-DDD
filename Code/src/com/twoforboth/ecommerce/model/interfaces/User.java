package com.twoforboth.ecommerce.model.interfaces;

import com.twoforboth.ecommerce.model.impl.OrderDetailImpl;

import java.util.Date;
import java.util.List;

public interface User {
    Long getId();

    String getName();

    String getAddress();

    String getPhoneNumber();

    Boolean getIsEnabled();

    Date getCreated();

    List<Order> getOrders();

    void setId(Long id);

    void setName(String name);

    void setAddress(String address);

    void setPhoneNumber(String phoneNumber);

    void setIsEnabled(Boolean isEnabled);

    void setCreated(Date created);

    boolean equals(Object o);

    int hashCode();

    String toString();
}
