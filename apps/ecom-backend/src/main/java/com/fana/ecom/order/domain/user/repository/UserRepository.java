package com.fana.ecom.order.domain.user.repository;

import java.util.Optional;

import com.fana.ecom.order.domain.user.aggregate.User;
import com.fana.ecom.order.domain.user.vo.UserAddressToUpdate;
import com.fana.ecom.order.domain.user.vo.UserEmail;
import com.fana.ecom.order.domain.user.vo.UserPublicId;

public interface UserRepository {

    void save(User user);

    Optional<User> get(UserPublicId userPublicId);

    Optional<User> getOneByEmail(UserEmail userEmail);

    void updateAddress(UserPublicId userPublicId, UserAddressToUpdate userAddress);

}
