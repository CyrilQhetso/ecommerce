package com.fana.ecom.order.domain.order.aggregate;

import org.jilt.Builder;

import com.fana.ecom.order.domain.order.vo.StripeSessionId;
import com.fana.ecom.order.domain.user.vo.UserAddressToUpdate;

import java.util.List;

@Builder
public record StripeSessionInformation(StripeSessionId stripeSessionId,
                                       UserAddressToUpdate userAddress,
                                       List<OrderProductQuantity> orderProductQuantit) {

}
