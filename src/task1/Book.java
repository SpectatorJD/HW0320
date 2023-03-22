package task1;

public class Book {

    private final String nameBook;
    private int yearCreate;
    private final String firstNameAuthor;
    private final String nameAuthor;



 public Book (String firstNameAuthor, String nameAuthor, String nameBook, int yearCreate ) {
     this.nameBook = nameBook;
     this.yearCreate = yearCreate;
     this.firstNameAuthor = firstNameAuthor;
     this.nameAuthor = nameAuthor;

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

    public String getFirstNameAuthor (){
        return this.firstNameAuthor;
    }
    public String getNameAuthor(){
        return this.nameAuthor;
    }
}
