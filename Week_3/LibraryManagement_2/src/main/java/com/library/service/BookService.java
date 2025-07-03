package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayServiceMessage() {
        System.out.println("BookService is working.");
        if (bookRepository != null) {
            bookRepository.displayRepositoryMessage();
        } else {
            System.out.println("BookRepository is not injected.");
        }
    }
}
