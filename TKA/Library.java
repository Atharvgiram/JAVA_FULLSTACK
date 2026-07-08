package com.TKA;

public class Library {

    int libraryId = 101;
    String libraryName = "Central Library";
    String location = "Pune";
    int totalBooks = 5000;
    int availableBooks = 4200;
    String librarianName = "Mr. Sharma";
    String contactNo = "9876543210";

    void addBook() {
        System.out.println("New Book Added Successfully.");
    }

    void displayDetails() {
        System.out.println("Library ID : " + libraryId);
        System.out.println("Library Name : " + libraryName);
        System.out.println("Location : " + location);
        System.out.println("Total Books : " + totalBooks);
        System.out.println("Available Books : " + availableBooks);
        System.out.println("Librarian : " + librarianName);
        System.out.println("Contact : " + contactNo);
    }
}