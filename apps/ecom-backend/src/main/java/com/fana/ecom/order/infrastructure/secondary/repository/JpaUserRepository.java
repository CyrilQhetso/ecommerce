package com.fana.ecom.order.infrastructure.secondary.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.fana.ecom.order.infrastructure.secondary.entity.UserEntity;

public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByEmail(String email);

    List<UserEntity> findbyPublicIdIn(List<UUID> publicIds);

    Optional<UserEntity> findOneByPublicId(UUID publicId);

    @Modifying
    @Query("UPDATE UserEntity  user " +
        "SET user.addressStreet = :street, user.addressCity = :city, " +
        " user.addressCountry = :country, user.addressZipCode = :zipCode " +
        "WHERE user.publicId = :userPublicId")
    void updateAddress(UUID userPublicId, String street, String city, String country, String zipCode);
}
