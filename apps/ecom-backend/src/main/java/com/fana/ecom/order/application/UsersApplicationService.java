package com.fana.ecom.order.application;

import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fana.ecom.order.domain.user.aggregate.User;
import com.fana.ecom.order.domain.user.repository.UserRepository;
import com.fana.ecom.order.domain.user.service.UserReader;
import com.fana.ecom.order.domain.user.service.UserSynchronizer;
import com.fana.ecom.order.domain.user.vo.UserAddressToUpdate;
import com.fana.ecom.order.domain.user.vo.UserEmail;
import com.fana.ecom.order.infrastructure.secondary.service.fana.KindeService;
import com.fana.ecom.shared.authentication.application.AuthenticatedUser;
import com.fana.ecom.shared.authentication.application.NotAuthenticatedUserException;

@Service
public class UsersApplicationService {

    private final UserSynchronizer userSynchronizer;
    private final UserReader userReader;

    public UsersApplicationService(UserRepository userRepository, KindeService kindeService) {
        this.userSynchronizer = new UserSynchronizer(userRepository, kindeService);
        this.userReader = new UserReader(userRepository);
    }

    @Transactional
    public User getAuthenticatedUserWithSync(Jwt jwtToken, boolean forceResync) throws NotAuthenticatedUserException {
        userSynchronizer.syncWithIdp(jwtToken, forceResync);
        return userReader.getByEmail(new UserEmail(AuthenticatedUser.username().get()))
            .orElseThrow();
    }

    @Transactional
    public void updateAddress(UserAddressToUpdate userAddressToUpdate) {
        userSynchronizer.updateAddress(userAddressToUpdate);
    }
}
