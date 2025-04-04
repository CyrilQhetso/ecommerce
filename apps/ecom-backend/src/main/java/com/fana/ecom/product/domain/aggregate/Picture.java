package com.fana.ecom.product.domain.aggregate;

import org.jilt.Builder;

import com.fana.ecom.shared.error.domain.Assert;

@Builder
public record Picture(byte[] file, String mimeType) {

    public Picture {
        Assert.notNull("file", file);
        Assert.notNull("mimeType", mimeType);
    }
}
