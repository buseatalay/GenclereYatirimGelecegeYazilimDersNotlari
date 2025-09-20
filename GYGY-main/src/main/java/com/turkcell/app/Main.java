package com.turkcell.app;

import com.turkcell.app.entity.User;
import com.turkcell.app.repository.UserRepository;
import com.turkcell.app.service.UserService;

import java.util.List;
// Presentation Layer

// SOLID -> Dependency Inversion Principal
public class Main {

    public static void main(String[] args) {
     // Genel veritabanı

        UserService userService = new UserService(new UserRepository());

        User user = new User();
        user.setId(1);
        user.setEmail("turkcell@gmail.com");
        user.setName("Turkcell222");
        user.setPassword("a");

        userService.save(user);



    }
}
