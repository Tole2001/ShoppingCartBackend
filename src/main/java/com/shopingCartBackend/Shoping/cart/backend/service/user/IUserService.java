package com.shopingCartBackend.Shoping.cart.backend.service.user;


import com.shopingCartBackend.Shoping.cart.backend.dto.UserDto;
import com.shopingCartBackend.Shoping.cart.backend.model.User;
import com.shopingCartBackend.Shoping.cart.backend.request.CreateUserRequest;
import com.shopingCartBackend.Shoping.cart.backend.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
