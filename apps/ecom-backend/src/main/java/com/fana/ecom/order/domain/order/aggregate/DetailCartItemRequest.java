package com.fana.ecom.order.domain.order.aggregate;

import org.jilt.Builder;

import com.fana.ecom.product.domain.vo.PublicId;

@Builder
public record DetailCartItemRequest(PublicId productId, long quantity) {

}
