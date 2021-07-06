package com.twoforboth.ecommerce.model.interfaces;

public interface Person {
    Long getId();

    String getName();

    String getAddress();

    String getPhoneNumber();

    Boolean getIsEnabled();

    java.util.Date getCreated();

    void setId(Long id);

    void setName(String name);

    void setAddress(String address);

    void setPhoneNumber(String phoneNumber);

    void setIsEnabled(Boolean isEnabled);

    void setCreated(java.util.Date created);

    boolean equals(Object o);

    int hashCode();

    String toString();
}
