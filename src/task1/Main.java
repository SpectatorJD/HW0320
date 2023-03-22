package task1;


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Пушкин ","Капитанская дочка ",1836);
        System.out.println(book1.getAuthor()+book1.getNameBook()+book1.getYearCreate());

    }

}
