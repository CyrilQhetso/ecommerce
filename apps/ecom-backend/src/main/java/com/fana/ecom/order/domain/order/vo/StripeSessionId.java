package com.fana.ecom.order.domain.order.vo;

import com.fana.ecom.shared.error.domain.Assert;

public record StripeSessionId(String value) {

    public StripeSessionId {
        Assert.notNull("value", value);
      }
}
