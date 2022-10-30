package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> retrieveAllCategorieProduits() {
        return userRepository.findAll();
    }

    @Override
    public User addCategorieProduit(User u) {
        return userRepository.save(u);
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
        return  userRepository.findById(id).orElse(null);
    }
}
