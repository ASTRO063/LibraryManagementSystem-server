package com.librarymanagement.librarymanagementsystem_server.Services;

import com.librarymanagement.librarymanagementsystem_server.Exceptions.UserAlreadyExistsException;
import com.librarymanagement.librarymanagementsystem_server.Exceptions.UserNotFoundException;
import com.librarymanagement.librarymanagementsystem_server.Models.User;
import com.librarymanagement.librarymanagementsystem_server.Repositories.IUsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
   @Autowired
   private IUsersRepository usersRepository;

    public User fetchByEmail(String emailId) {
        User userobj = null;

        if (emailId != null && !"".equals(emailId)) {
            userobj = usersRepository.findByEmail(emailId);

            if (userobj != null) {
                throw new UserAlreadyExistsException(emailId);
            }
        }
        return userobj;
    }

    public User saveUser(User user) {
        return usersRepository.save(user);
    }

    public User userWithEmailAndPass(String email, String password) {
        User user = null;
        if (email != null && "".equals(email) && password != null) {
            user = usersRepository.findByEmailAndPassword(email, password);
        }
        if (user == null) {
            throw new UserNotFoundException(email);
        }
        return user;
    }
}
