package com.twoforboth.ecommerce.model.impl;

import com.twoforboth.ecommerce.model.interfaces.Order;
import com.twoforboth.ecommerce.model.interfaces.OrderDetail;
import com.twoforboth.ecommerce.model.interfaces.User;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@DynamicUpdate
public
class OrderImpl implements Order {
    private Long id;
    private User user;
    @OneToMany(mappedBy="Order")
    private List<OrderDetail> orderDetailList;
}
