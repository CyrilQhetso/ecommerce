package com.fana.ecom.order.domain.order.vo;

import com.fana.ecom.shared.error.domain.Assert;

public record OrderPrice(double value) {

    public OrderPrice {
        Assert.field("value", value).strictlyPositive();
    }
}
