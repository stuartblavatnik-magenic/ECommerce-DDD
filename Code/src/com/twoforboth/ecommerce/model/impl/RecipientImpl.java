package com.twoforboth.ecommerce.model.impl;

import com.twoforboth.ecommerce.model.impl.PersonImpl;
import com.twoforboth.ecommerce.model.interfaces.Recipient;
import lombok.Data;

import java.util.Date;

public @Data class RecipientImpl extends PersonImpl implements Recipient {
    Date birthday;
}
