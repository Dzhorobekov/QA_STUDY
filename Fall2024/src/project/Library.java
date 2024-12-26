package project;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBooks(Book book) {
        books.add(book);
        System.out.println("The book" + book.getTitle() + " has been added to the library");
    }

    public void showBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }
    }

    public void searchBook(String bookInfo) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(bookInfo.toLowerCase())
                    || book.getAuthor().toLowerCase().contains(bookInfo.toLowerCase())) {
                if (book.isAvailable()) {
                    System.out.println(book.getTitle() + "by " + book.getAuthor() + " is found.");
                    book.setAvailable(false);
                } else{
                    System.out.println(book.getTitle() + "by " + book.getAuthor() + " is not found.");
                }
            }else {
                System.out.println("There is no such book in the library.");
            }
        }
    }
}
