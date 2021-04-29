package com.librarymanagement.librarymanagementsystem_server.Exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String email){
        super("Could not find user " + email);
    }
}