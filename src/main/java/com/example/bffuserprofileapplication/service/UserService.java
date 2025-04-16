package com.example.bffuserprofileapplication.service;

import com.example.bffuserprofileapplication.client.UserClient;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserClient userClient;

    public UserService(UserClient userClient) {
        this.userClient = userClient;
    }

    public List<User> getAllUsers() {
        return userClient.getAllUsers();
    }

    public User getUserById(Long id) {
        return userClient.getUserById(id);
    }

    public User createUser(User user) {
        return userClient.createUser(user);
    }

    public User updateUser(Long id, User user) {
        return userClient.updateUser(id, user);
    }

    public ResponseEntity<Void> deleteUser(Long id) {
        return userClient.deleteUser(id);
    }
}