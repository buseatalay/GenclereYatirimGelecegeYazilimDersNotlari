package com.turkcell.app.repository;


import com.turkcell.app.entity.Product;
import com.turkcell.app.entity.User;

import java.util.ArrayList;
import java.util.List;


// UserDal, UserDao
public class UserRepository implements BaseRepository<User> {

    //In-Memory
    List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {

        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }

    public void save(User user) {
        users.add(user);
    }

    public void delete(User user){

    }
}
