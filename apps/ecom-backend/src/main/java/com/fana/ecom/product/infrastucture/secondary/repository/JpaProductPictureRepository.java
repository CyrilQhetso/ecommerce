package com.fana.ecom.product.infrastucture.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fana.ecom.product.infrastucture.secondary.entity.PictureEntity;

public interface JpaProductPictureRepository extends JpaRepository<PictureEntity, Long> {

}
