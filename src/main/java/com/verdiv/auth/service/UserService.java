package com.verdiv.auth.service;

import com.verdiv.auth.entity.User;

public interface UserService {
    User registerUser(User user);

    User findByUsername(String username);
}