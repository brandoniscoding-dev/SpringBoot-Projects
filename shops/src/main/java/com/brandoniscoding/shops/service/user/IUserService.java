package com.brandoniscoding.shops.service.user;

import com.brandoniscoding.shops.dto.UserDto;
import com.brandoniscoding.shops.model.User;
import com.brandoniscoding.shops.request.CreateUserRequest;
import com.brandoniscoding.shops.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
