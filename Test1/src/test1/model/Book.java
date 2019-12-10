/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.model;

import java.io.Serializable;

/**
 *
 * @author minhtanit
 */
public class Book implements Serializable{
    private int code;
    private String title;
    private String author;
    private String fieldBook;
    private int publishedYear;
    private int numbers;

    public Book() {
    }

    public Book(int code, String title, String author, String fieldBook, int publishedYear, int numbers) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.fieldBook = fieldBook;
        this.publishedYear = publishedYear;
        this.numbers = numbers;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public String getFieldBook() {
        return fieldBook;
    }

    public void setFieldBook(String fieldBook) {
        this.fieldBook = fieldBook;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }
    
    public Object[] toObjects() {
        return new Object[] {code, title, author, fieldBook, publishedYear, numbers};
    }
}
