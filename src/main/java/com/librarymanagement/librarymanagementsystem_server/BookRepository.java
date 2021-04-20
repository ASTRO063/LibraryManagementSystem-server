package com.librarymanagement.librarymanagementsystem_server;

import java.util.Optional;

public class BookRepository implements IBooksRepository {

    public Iterable<Book> searchBooks(String title) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Book> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Book> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Book> findById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean existsById(String id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterable<Book> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<Book> findAllById(Iterable<String> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(String id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(Book entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends Book> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Iterable<Book> findByTitleContainingIgnoreCase(String title) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
