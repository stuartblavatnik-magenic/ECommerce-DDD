package com.twoforboth.ecommerce.model.interfaces;

public interface Recipient {
    Long getId();

    String getName();

    String getAddress();

    String getPhoneNumber();

    void setId(Long id);

    void setName(String name);

    void setAddress(String address);

    void setPhoneNumber(String phoneNumber);

    boolean equals(Object o);

    int hashCode();

    String toString();
}
