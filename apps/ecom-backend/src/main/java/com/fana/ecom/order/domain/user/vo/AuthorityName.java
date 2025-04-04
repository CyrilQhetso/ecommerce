package com.fana.ecom.order.domain.user.vo;

import com.fana.ecom.shared.error.domain.Assert;

public record AuthorityName(String name) {

    public AuthorityName {
        Assert.field("name", name).notNull();
    }
}
