package task1;

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

     public Author getAuthor() {
        return author;
    }


    public String getNameBook() {
        return nameBook;
    }


}