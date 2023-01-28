package kosta.basic.sql.day024.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Books {
    List<Book> books = new ArrayList<>();

    public Books() {
    }

    public Books(List<Book> books) {
        this.books = books;
    }

    public Books(Book... books) {
        this.books = Arrays.asList(books);
    }

    public void show(){
        books.forEach(Book::show);
    }

    @Override
    public String toString() {
        return "Books list {" + "books=" + books + '}';
    }
}
