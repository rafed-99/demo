package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService implements IUserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> retrieveAllCategorieProduits() {
        List<User> users = (List<User>) userRepository.findAll();
        return users;
    }

    @Override
    public User addCategorieProduit(User u) {
        userRepository.save(u);
        return u;
    }

    @Override
    public void deleteCategorieProduit(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateCategorieProduit(User u) {
        userRepository.save(u);
        return u;
    }

    @Override
    public User retrieveCategorieProduit(Long id) {
        User user = userRepository.findById(id).orElse(null);
        return user;
    }
}
