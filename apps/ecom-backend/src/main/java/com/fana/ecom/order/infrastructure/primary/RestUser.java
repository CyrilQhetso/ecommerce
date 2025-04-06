package com.fana.ecom.order.infrastructure.primary;

import org.jilt.Builder;

import com.fana.ecom.order.domain.user.aggregate.User;

import java.util.Set;
import java.util.UUID;

@Builder
public record RestUser(UUID publicId,
                    String firstName,
                    String lastName,
                    String email,
                    String imageUrl,
                    Set<String> authorities) {

    public static RestUser from(User user) {
        RestUserBuilder restUserBuilder = RestUserBuilder.restUser();

        if (user.getImageUrl() != null) {
            restUserBuilder.imageUrl(user.getImageUrl().value());
        }

        return restUserBuilder
            .email(user.getEmail().value())
            .firstName(user.getFirstname().value())
            .lastName(user.getLastname().value())
            .authorities(RestAuthority.fromSet(user.getAuthorities()))
            .build();
    }
}
