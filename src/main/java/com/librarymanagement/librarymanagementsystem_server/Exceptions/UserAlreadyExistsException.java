package com.librarymanagement.librarymanagementsystem_server.Exceptions;

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String email){
        super("User with email id already exists " + email);
    }
}