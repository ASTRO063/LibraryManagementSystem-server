package com.librarymanagement.librarymanagementsystem_server;

import java.util.List;

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
    private IUsersRepository usersRepository;

    @PostMapping(path = "/signup")
    @CrossOrigin(origins = "http://localhost:3000")
    public @ResponseBody Iterable<User> addNewUser(@RequestBody List<User> user) {
        usersRepository.saveAll(user);
        // users.save((User) data);
        return usersRepository.findAll();

    }
    // @PostMapping(path="/login")
    // @CrossOrigin(origins="http://localhost:3000")
    // public @ResponseBody String logedin(@RequestBody User person){
    // boolean exists = usersRepository.existsById(person);

    // return "good";
    // }

}