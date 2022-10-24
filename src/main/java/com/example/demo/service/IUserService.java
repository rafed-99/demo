package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface IUserService {

    List<User> retrieveAllCategorieProduits();

    User addCategorieProduit(User u);

    void deleteCategorieProduit(Long id);

    User updateCategorieProduit(User u);

    User retrieveCategorieProduit(Long id);
}
