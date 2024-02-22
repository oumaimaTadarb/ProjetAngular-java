package com.management.restcontrollers;

import com.management.entities.User;
import com.management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api")
@CrossOrigin("*")
public class UserRestController {
    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/auth")
    public ResponseEntity<Map<String, String>> authenticateUser(@RequestBody Map<String, String> credentials) {
        String nameUser = credentials.get("nameUser");
        String passwordUser = credentials.get("passwordUser");

        User authenticatedUser = userService.authenticateUser(nameUser, passwordUser);

        if (authenticatedUser != null) {
            Map<String, String> successResponse = Collections.singletonMap("message", "Authentication successful");
            return new ResponseEntity<>(successResponse, HttpStatus.OK);
        } else {
            Map<String, String> errorResponse = Collections.singletonMap("message", "Authentication failed");
            return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
        }
    }

    @GetMapping("/users")
    @ResponseBody
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
