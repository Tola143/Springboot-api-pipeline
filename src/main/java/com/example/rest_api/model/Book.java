package com.example.rest_api.model;

import jakarta.persistence.*;

@Entity
@Table(name= "books")  // Optional: Specify table name explicitly
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String isbh;

    // No-argument constructor
    public Book() {
    }

    // All-argument constructor
    public Book(Long id, String title, String author, String isbh) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbh = isbh;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbh() {
        return isbh;
    }

    public void setIsbh(String isbh) {
        this.isbh = isbh;
    }
}
