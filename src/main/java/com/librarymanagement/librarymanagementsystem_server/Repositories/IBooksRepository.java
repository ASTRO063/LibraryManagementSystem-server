package com.librarymanagement.librarymanagementsystem_server.Repositories;

import com.librarymanagement.librarymanagementsystem_server.Models.Book;

import org.springframework.data.repository.CrudRepository;

public interface IBooksRepository extends CrudRepository<Book, String> {

    Iterable<Book> findAllByTitle(String title);

    Iterable<Book> findByTitleContainingIgnoreCase(String title);
}
