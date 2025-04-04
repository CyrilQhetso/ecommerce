package com.fana.ecom.order.domain.user.vo;

import java.util.UUID;

import com.fana.ecom.shared.error.domain.Assert;

public record UserPublicId(UUID value) {

    public UserPublicId {
        Assert.notNull("value", value);
    }
}
