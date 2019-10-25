package io.turntabl.library;

public class Book {
        private String title;
        private int isbn;
        private String category;
        private String authour;
        private BookState BookState;

    public Book(String title, int isbn, String category, String authour, io.turntabl.library.BookState bookState) {
        this.title = title;
        this.isbn = isbn;
        this.category = category;
        this.authour = authour;
        BookState = bookState;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getCategory() {
        return category;
    }

    public String getAuthour() {
        return authour;
    }

    public io.turntabl.library.BookState getBookState() {
        return BookState;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn=" + isbn +
                ", category='" + category + '\'' +
                ", authour='" + authour + '\'' +
                ", BookState=" + BookState +
                '}';
    }
}