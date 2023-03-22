package task1;

public class Book {

    private final String nameBook;
    private int yearCreate;



 public Book (String nameBook, int yearCreate) {
     this.nameBook = nameBook;
     this.yearCreate = yearCreate;


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
