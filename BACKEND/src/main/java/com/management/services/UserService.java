package com.management.services;

import com.management.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User saveUser(User user);
    User authenticateUser(String name,String password);
    List<User> getAllUsers();
}
