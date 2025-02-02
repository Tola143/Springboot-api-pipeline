package com.example.rest_api.service;

import com.example.rest_api.model.Book;
import com.example.rest_api.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    // Constructor injection
    private final BookRepo bookRepo;

    @Autowired   //If we use constructor injection, @Autowired is option to add
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    // List all books
    public List<Book> getAllBooks(){
        return bookRepo.findAll();

    }

    // Find a book by id
    public Optional<Book> getBookById(Long id){
        return bookRepo.findById(id);
    }

    // Create book
    public Book createBook(Book book){
        return bookRepo.save(book);
    }

    // Update book
    @Transactional
    public Book updateBook(Long id, Book updatedBook) {
        return bookRepo.findById(id)
                .map(existingBook -> {
                    existingBook.setTitle(updatedBook.getTitle());
                    existingBook.setAuthor(updatedBook.getAuthor());
                    existingBook.setIsbh(updatedBook.getIsbh());
                    return bookRepo.save(existingBook);
                })
                .orElseThrow(() -> new RuntimeException("Book not found with id " + id));
    }

    // Delete book
    public void deleteBook(Long id){
        if(bookRepo.existsById(id)){
            bookRepo.deleteById(id);
        } else {
            throw new RuntimeException("Book not found with id: " + id);
        }
    }

}
