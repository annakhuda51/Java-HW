package com.groupqa1;

import java.util.Arrays;

public class Books {
    private int size;
    private Book[] books = new Book[size];

    public Books() { }

    public Books(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Book[] addBook(Book book){
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
        return books;
    }

    public void printAll(){
        for(Book book:books){
            book.view();
        }
    }

    public void changeCost(int percent){
        for(int i = 0; i<books.length; i++){
            books[i].setCost(books[i].getCost() + books[i].getCost() * percent/100);
        }
    }

    public void findByAuthor(String author){
        for(Book book: books){
            if(book.getAuthor().equals(author)){
                book.view();
            }
        }
    }

    public void findByYear(int year){
        for(Book book: books){
            if(book.getYearOfPublishing()>=year){
                book.view();
            }
        }
    }
    
}
