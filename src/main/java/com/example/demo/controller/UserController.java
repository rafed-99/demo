package com.example.demo.controller;


import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @Autowired
    private ModelMapper modelMapper;

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
    public User addCategorieProduit(@RequestBody UserDTO user) {
        User persistentUser = modelMapper.map (user , User.class);
        return userService.addCategorieProduit(persistentUser);
    }
    @DeleteMapping("/remove-categorieProduit/{categorieProduit-id}")
    @ResponseBody
    public void removeCategorieProduit(@PathVariable("categorieProduit-id") Long categorieProduitId) {
        userService.deleteCategorieProduit(categorieProduitId);
    }
    @PutMapping("/modify-categorieProduit")
    @ResponseBody
    public User modifyCategorieProduit(@RequestBody UserDTO user) {
        User persistentUser = modelMapper.map (user , User.class);
        return userService.updateCategorieProduit(persistentUser);
    }
}
