package com.librarymanagement.librarymanagementsystem_server.Services;



import com.librarymanagement.librarymanagementsystem_server.Models.Book;
import com.librarymanagement.librarymanagementsystem_server.Repositories.IBooksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksServices {

    @Autowired
    private IBooksRepository booksRepository;

    public Iterable<Book> saveBooks(Iterable<Book> books) {
        return booksRepository.saveAll(books);
    }

    public Iterable<Book> fetchAllBooks() {
        return booksRepository.findAll();
    }

    public Iterable<Book> fetchbooks(String title) {
        return booksRepository.findByTitleContainingIgnoreCase(title);
    }




   
    
}
