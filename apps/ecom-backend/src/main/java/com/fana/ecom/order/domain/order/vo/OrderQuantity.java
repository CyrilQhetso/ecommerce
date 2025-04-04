package com.fana.ecom.order.domain.order.vo;

import com.fana.ecom.shared.error.domain.Assert;

public record OrderQuantity(long value) {

    public OrderQuantity {
        Assert.field("value", value).positive();
    }
}
