package me.dio.Application.service;

import me.dio.Application.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User user);
}
