package com.fana.ecom.order.domain.order.aggregate;

import org.jilt.Builder;

import com.fana.ecom.order.domain.order.vo.OrderQuantity;
import com.fana.ecom.order.domain.order.vo.ProductPublicId;

@Builder
public record OrderProductQuantity(OrderQuantity quantity, ProductPublicId productPublicId) {

}
