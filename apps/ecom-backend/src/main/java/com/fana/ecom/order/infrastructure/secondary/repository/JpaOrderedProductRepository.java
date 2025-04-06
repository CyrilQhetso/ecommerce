package com.fana.ecom.order.infrastructure.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fana.ecom.order.infrastructure.secondary.entity.OrderedProductEntity;
import com.fana.ecom.order.infrastructure.secondary.entity.OrderedProductEntityPk;

public interface JpaOrderedProductRepository extends JpaRepository<OrderedProductEntity, OrderedProductEntityPk> {

}
