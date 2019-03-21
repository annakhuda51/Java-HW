package com.groupqa1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        while (size <= 0) {
            System.out.print("Please enter the number bigger than 0: ");
            size = sc.nextInt();
        }

        Books books = new Books();
        books.setSize(size);

        Book b1 = new Book(1, "Name1", "Author1", "Publisher1", 1990, 300, 300);
        Book b2 = new Book(2, "Name2", "Author2", "Publisher2", 1990, 300, 300);
        Book b3 = new Book(3, "Name3", "Author3", "Publisher1", 1990, 300, 300);
        Book b4 = new Book(4, "Name4", "Author4", "Publisher4", 1990, 300, 300);
        books.addBook(b1);
        books.addBook(b2);
        books.addBook(b3);
        books.addBook(b4);

        books.printAll();

        System.out.print("Enter percent: ");
        int percent = sc.nextInt();
        while (percent <= 0 || percent >=100) {
            System.out.print("Please enter the number bigger than 0 and smaller than 100: ");
            percent = sc.nextInt();
        }
        books.changeCost(percent);
        books.printAll();

        System.out.println();
        books.findByAuthor("Author1");

        System.out.print("\nPlease enter the year to find the book: ");
        int year = sc.nextInt();
        while(year <= 0){
            System.out.print("Please enter the number bigger than 0");
            year = sc.nextInt();
        }
        books.findByYear(year);
    }
}
