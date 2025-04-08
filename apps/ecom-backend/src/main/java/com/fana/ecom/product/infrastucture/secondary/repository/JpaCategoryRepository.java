package com.fana.ecom.product.infrastucture.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

import com.fana.ecom.product.infrastucture.secondary.entity.CategoryEntity;

public interface JpaCategoryRepository extends JpaRepository<CategoryEntity, Long> {

    Optional<CategoryEntity> findByPublicId(UUID publicId);

    int deleteByPublicId(UUID publicId);
}
