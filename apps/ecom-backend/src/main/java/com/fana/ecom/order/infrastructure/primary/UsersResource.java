package com.fana.ecom.order.infrastructure.primary;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fana.ecom.order.application.UsersApplicationService;
import com.fana.ecom.order.domain.user.aggregate.User;
import com.fana.ecom.shared.authentication.application.NotAuthenticatedUserException;

@RestController
@RequestMapping("/api/users")
public class UsersResource {

    private final UsersApplicationService usersApplicationService;

    public UsersResource(UsersApplicationService usersApplicationService) {
        this.usersApplicationService = usersApplicationService;
    }

    @GetMapping("/authenticated")
    public ResponseEntity<RestUser> getAuthenticatedUser(@AuthenticationPrincipal Jwt jwtToken,
                                                        @RequestParam boolean forceResync) throws NotAuthenticatedUserException {
        User authenticatedUser =  usersApplicationService.getAuthenticatedUserWithSync(jwtToken, forceResync);
        RestUser restUser = RestUser.from(authenticatedUser);
        return ResponseEntity.ok(restUser);
    }
}
