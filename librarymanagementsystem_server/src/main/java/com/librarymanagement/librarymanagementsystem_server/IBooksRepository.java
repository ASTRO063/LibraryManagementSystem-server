package com.librarymanagement.librarymanagementsystem_server;

import org.springframework.data.repository.CrudRepository;

public interface IBooksRepository extends CrudRepository<Book, String> {

    Iterable<Book> findByTitleContainingIgnoreCase(String title);

    // Iterable<Book> searchBooks(String title);
}
