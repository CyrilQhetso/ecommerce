package com.fana.ecom.order.domain.user.service;

import java.util.Optional;

import com.fana.ecom.order.domain.user.aggregate.User;
import com.fana.ecom.order.domain.user.repository.UserRepository;
import com.fana.ecom.order.domain.user.vo.UserEmail;
import com.fana.ecom.order.domain.user.vo.UserPublicId;

public class UserReader {

    private final UserRepository userRepository;

  public UserReader(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Optional<User> getByEmail(UserEmail userEmail) {
    return userRepository.getOneByEmail(userEmail);
  }

  public Optional<User> getByPublicId(UserPublicId userPublicId) {
    return userRepository.get(userPublicId);
  }
}
