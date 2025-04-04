package com.fana.ecom.order.domain.user.vo;

import org.jilt.Builder;

import com.fana.ecom.shared.error.domain.Assert;

@Builder
public record UserAddressToUpdate(UserPublicId userPublicId, UserAddress userAddress) {

    public UserAddressToUpdate {
        Assert.notNull("value", userPublicId);
        Assert.notNull("value", userAddress);
      }
}
