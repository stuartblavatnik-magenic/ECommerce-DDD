package com.twoforboth.ecommerce.model.impl;

import com.twoforboth.ecommerce.model.impl.PersonImpl;
import com.twoforboth.ecommerce.model.interfaces.Order;
import com.twoforboth.ecommerce.model.interfaces.OrderDetail;
import com.twoforboth.ecommerce.model.interfaces.Recipient;
import lombok.Data;

import java.util.List;

/**
 * User of the system
 */
public @Data
class UserImpl extends PersonImpl {

    private String userName;

    private List<Order> orders;
    private List<Recipient> recipients;

}
