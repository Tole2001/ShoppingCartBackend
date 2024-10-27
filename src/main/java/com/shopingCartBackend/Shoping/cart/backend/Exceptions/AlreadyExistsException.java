package com.shopingCartBackend.Shoping.cart.backend.Exceptions;

public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException(String message) {
        super(message);
    }
}
