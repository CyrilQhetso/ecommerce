package com.fana.ecom.product.domain.vo;

import java.util.UUID;

import com.fana.ecom.shared.error.domain.Assert;

public record PublicId(UUID value) {

    public PublicId {
        Assert.notNull("value", value);
    }
}
