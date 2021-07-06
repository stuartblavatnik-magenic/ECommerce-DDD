package com.twoforboth.ecommerce.model.impl;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@DynamicUpdate
public
class OrderImpl implements com.twoforboth.ecommerce.model.interfaces.Order {
    private Long id;
    private UserImpl userImpl;
    @OneToMany(mappedBy="Order")
    private List<OrderDetailImpl> orderDetailList;
}
