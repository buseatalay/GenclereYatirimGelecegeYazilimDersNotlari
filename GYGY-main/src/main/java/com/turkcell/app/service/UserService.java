package com.turkcell.app.service;

import com.turkcell.app.entity.User;
import com.turkcell.app.repository.UserRepository;

import java.util.List;

public class UserService {

    // Bağımlılık - Dependency
    UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public void save(User user) {

        if (user.getEmail().length() < 4)
            return;

        if (!user.getEmail().contains("@"))
            return;

        if (user.getPassword().length() < 4)
            return;
        //Repository
        userRepository.save(user);


    }


        public List<User> getAll(){
        return  userRepository.findAll();
    }
}
