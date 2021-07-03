package com.twoforboth.ecommerce.model;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@DynamicUpdate
public
class Order {
    private Long id;
    private Long userId;
    @OneToMany(mappedBy="Order")
    private List<OrderDetail> orderDetailList;
}
