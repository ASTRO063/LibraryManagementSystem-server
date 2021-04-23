package com.librarymanagement.librarymanagementsystem_server;

import java.util.List;

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
@RequestMapping(path="/book")
public class BooksController {
    @Autowired
    private IBooksRepository booksRepository;

    @PostMapping(path="/add")
    @CrossOrigin(origins = "http://localhost:3000")
    public @ResponseBody Iterable<Book> addNewBook (@RequestBody List<Book> books){
        booksRepository.saveAll(books);
        return booksRepository.findAll();
    }

    @GetMapping(path="/all")
        public @ResponseBody Iterable<Book> getAllBooks(){
            return booksRepository.findAll();
        }
    
    @GetMapping(path="/search")
    public @ResponseBody Iterable<Book> search(@RequestParam(value = "title", required = true) String title){
        return booksRepository.findByTitleContainingIgnoreCase(title);
    }
}   
