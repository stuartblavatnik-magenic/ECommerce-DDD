package com.twoforboth.ecommerce.model.interfaces;

import com.twoforboth.ecommerce.model.impl.OrderDetailImpl;

public interface User {
    Long getId();

    String getName();

    String getAddress();

    String getPhoneNumber();

    Boolean getIsEnabled();

    java.util.Date getCreated();

    java.util.List<OrderDetailImpl> getOrderDetails();

    void setId(Long id);

    void setName(String name);

    void setAddress(String address);

    void setPhoneNumber(String phoneNumber);

    void setIsEnabled(Boolean isEnabled);

    void setCreated(java.util.Date created);

    void setOrderDetails(java.util.List<OrderDetailImpl> orderDetails);

    boolean equals(Object o);

    int hashCode();

    String toString();
}
