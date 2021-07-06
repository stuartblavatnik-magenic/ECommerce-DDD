package com.twoforboth.ecommerce.model.impl;


import com.twoforboth.ecommerce.model.interfaces.Person;
import lombok.Data;

import java.util.Date;

public
@Data abstract class PersonImpl implements Person {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private Boolean isEnabled;
    private Date created;
}
