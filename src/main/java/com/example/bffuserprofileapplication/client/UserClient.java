package com.example.bffuserprofileapplication.client;

import org.apache.catalina.User;
import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@FeignClient(name = "crud-app", url = "http://localhost:8089/users")
    public interface UserClient {

        @GetMapping
        List<User> getAllUsers();

        @GetMapping("/{id}")
        User getUserById(@PathVariable("id") Long id); //sinir

        @PostMapping
        User createUser(@RequestBody User user);

        @PutMapping("/{id}")
        User updateUser(@PathVariable("id") Long id, @RequestBody User user);

        @DeleteMapping("/{id}")
        ResponseEntity<Void> deleteUser(@PathVariable("id") Long id);
    }

