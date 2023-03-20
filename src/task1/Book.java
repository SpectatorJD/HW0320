package task1;

public class Book {
    String nameAuthor;
    String nameBook;
    int yearCreate;


 public Book (String nameAuthor, String nameBook, int yearCreate) {
     this.nameAuthor = nameAuthor;
     this.nameBook = nameBook;
     this.yearCreate = yearCreate;


 }
    public String getNameAuthor() {
        return this.nameAuthor;
    }
 public String getNameBook () {
     return this.nameBook;
 }

    public int getYearCreate() {
        return yearCreate;
    }
    public void setYearCreate (int yearCreate) {
     this.yearCreate = yearCreate;
    }
}
