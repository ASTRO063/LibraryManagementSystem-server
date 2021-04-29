package com.librarymanagement.librarymanagementsystem_server.Controllers;

import com.librarymanagement.librarymanagementsystem_server.DTO.UserDTO;
import com.librarymanagement.librarymanagementsystem_server.Models.User;
import com.librarymanagement.librarymanagementsystem_server.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/users")
public class UsersController {

    @Autowired
    private UserService service;

    @PostMapping(path = "/signup")
    @CrossOrigin(origins = "http://localhost:3000")
    public @ResponseBody User addNewUser(@RequestBody UserDTO user) {
        String emailId = user.getEmail();

        service.fetchByEmail(emailId);

        // for user entity from user DTO
        User userEntity = new User();
        userEntity.setContact(user.getContact());
        userEntity.setEmail(user.getEmail());
        userEntity.setName(user.getName());
        userEntity.setPassword(user.getPassword());

        return service.saveUser(userEntity);
    }

    @PostMapping(path = "/login")
    @CrossOrigin(origins = "http://localhost:3000")
    public @ResponseBody User signin(@RequestBody UserDTO user) {
        String email = user.getEmail();
        return service.userWithEmailAndPass(email, user.getPassword());
    }
}