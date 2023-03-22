package task1;

import task1.Author;

public class Book {

    private final String nameBook;
    private int yearCreate;
    private final Author author;

    public Book(Author author, String nameBook, int yearCreate) {
        this.nameBook = nameBook;
        this.yearCreate = yearCreate;
        this.author = author;

    }

    public int getYearCreate() {
        return yearCreate;
    }

    public void setYearCreate(int yearCreate) {
        this.yearCreate = yearCreate;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }
}