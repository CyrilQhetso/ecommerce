package com.fana.ecom.order.infrastructure.secondary.service.fana;

import com.fasterxml.jackson.annotation.JsonProperty;

public record KindeAccessToken(@JsonProperty("access_token") String accessToken,
                               @JsonProperty("token_type") String tokenType) {

}
