package com.shopingCartBackend.Shoping.cart.backend.Exceptions;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message){
        super(message);
    }
}
