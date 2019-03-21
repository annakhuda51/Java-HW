package com.groupqa1;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int numOfPages;
    private int cost;

    public Book() { }

    public Book(int id, String name, String author, String publisher, int yearOfPublishing, int numOfPages, int cost) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.numOfPages = numOfPages;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void view(){
        System.out.println(String.format("id = %s; name = %s; author = %s; publisher = %s; " +
                "year of publishing = %s; num of pages = %s; cost = %s", id, name, author, publisher,
                yearOfPublishing, numOfPages, cost));
    }
}
