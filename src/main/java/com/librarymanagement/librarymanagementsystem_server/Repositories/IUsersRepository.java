package com.librarymanagement.librarymanagementsystem_server.Repositories;

import com.librarymanagement.librarymanagementsystem_server.Models.User;

import org.springframework.data.repository.CrudRepository;

public interface IUsersRepository extends CrudRepository<User, String> {

    User findByEmail(String email);

    User findByEmailAndPassword(String email, String password);
}