package com.fana.ecom.order.domain.order.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.fana.ecom.order.domain.order.aggregate.Order;
import com.fana.ecom.order.domain.order.aggregate.StripeSessionInformation;
import com.fana.ecom.order.domain.order.vo.OrderStatus;
import com.fana.ecom.order.domain.user.vo.UserPublicId;
import com.fana.ecom.product.domain.vo.PublicId;

import java.util.Optional;

public interface OrderRepository {

    void save(Order order);

    void updateStatusByPublicId(OrderStatus orderStatus, PublicId orderPublicId);

    Optional<Order> findByStripeSessionId(StripeSessionInformation stripeSessionInformation);

    Page<Order> findAllByUserPublicId(UserPublicId userPublicId, Pageable pageable);

    Page<Order> findAll(Pageable pageable);

}
