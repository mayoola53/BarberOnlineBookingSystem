package org.michael.controllers;

import org.michael.entities.UserEntity;
import org.michael.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/getUsers")
    public String getUsers(Model model){
        model.addAttribute("users",userService.getAll());
        return "";
    }

    @GetMapping("/user/getUser/{id}")
    public String getUser(@PathVariable int id, Model model){
        model.addAttribute("user",userService.getById(id));
        return "";

    }
    @PostMapping("/user/addUser")
    public String addUser(@Valid UserEntity newUser){
        userService.addUser(newUser);
        return "registerUser";
    }

    @GetMapping("/user/editUser/{id}")
    public String editClassroom(@Valid UserEntity editedUser, @PathVariable int id, Model model) {
        userService.editUser(editedUser, id);
        model.addAttribute("user", userService.getAll());
        return "";
    }

    @GetMapping("/user/removeUser/{id}")
    public String removeClassroom(@PathVariable int id, Model model) {
        userService.removeUser(id);
        model.addAttribute("user", userService.getAll());
        return "";
    }



}



