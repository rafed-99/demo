package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/retrieve-all-categorieProduit")
    @ResponseBody
    public List<User> getCategorieProduit() {
        return userService.retrieveAllCategorieProduits();
    }
    @GetMapping("/retrieve-categorieProduit/{categorieProduit-id}")
    @ResponseBody
    public User retrieveCategorieProduit(@PathVariable("categorieProduit-id") Long categorieProduitId) {
        return userService.retrieveCategorieProduit(categorieProduitId);
    }
    @PostMapping("/add-categorieProduit")
    @ResponseBody
    public User addCategorieProduit(@RequestBody User user) {
        return userService.addCategorieProduit(user);
    }
    @DeleteMapping("/remove-categorieProduit/{categorieProduit-id}")
    @ResponseBody
    public void removeCategorieProduit(@PathVariable("categorieProduit-id") Long categorieProduitId) {
        userService.deleteCategorieProduit(categorieProduitId);
    }
    @PutMapping("/modify-categorieProduit")
    @ResponseBody
    public User modifyCategorieProduit(@RequestBody User user) {
        return userService.updateCategorieProduit(user);
    }
}
