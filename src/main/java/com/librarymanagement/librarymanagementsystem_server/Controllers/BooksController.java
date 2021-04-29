package com.librarymanagement.librarymanagementsystem_server.Controllers;

import com.librarymanagement.librarymanagementsystem_server.Models.Book;
import com.librarymanagement.librarymanagementsystem_server.Services.BooksServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping(path = "/book")
public class BooksController {
    @Autowired
    private BooksServices services;

    @PostMapping(path = "/add")
    @CrossOrigin(origins = "http://localhost:3000")
    public @ResponseBody Iterable<Book> addNewBook(@RequestBody Iterable<Book> books) {
        return services.saveBooks(books);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Book> getAllBooks() {
        return services.fetchAllBooks();
    }

    @GetMapping(path = "/search")
    public @ResponseBody Iterable<Book> search(@RequestParam(value = "title", required = true) String title) {
        return services.fetchbooks(title);
    }
}
