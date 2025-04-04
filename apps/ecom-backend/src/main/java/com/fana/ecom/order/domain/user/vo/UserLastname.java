package com.fana.ecom.order.domain.user.vo;

import com.fana.ecom.shared.error.domain.Assert;

public record UserLastname(String value) {

    public UserLastname {
        Assert.field("value", value).maxLength(255);
    }
}
