package com.fana.ecom.order.domain.order.vo;

import com.fana.ecom.shared.error.domain.Assert;

import java.util.UUID;

public record ProductPublicId(UUID value) {

    public ProductPublicId {
        Assert.notNull("value", value);
    }
}
