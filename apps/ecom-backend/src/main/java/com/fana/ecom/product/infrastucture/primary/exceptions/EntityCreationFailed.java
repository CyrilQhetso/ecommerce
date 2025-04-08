package com.fana.ecom.product.infrastucture.primary.exceptions;

public class EntityCreationFailed extends RuntimeException {
    public EntityCreationFailed(String message) {
        super(message);
    }
}
