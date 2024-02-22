package com.management.services;

import com.management.entities.User;
import com.management.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User authenticateUser(String name, String password) {
        User user=userRepository.findByNameUser(name);
        if (user != null && user.getPasswordUser().equals(password)){
            return user;
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
