package task1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book  ("Пушкин ", "Александр Сергеевич " , "Капитанская дочка ", 1836);
        System.out.println(book1.getFirstNameAuthor() + book1.getNameAuthor()+ book1.getNameBook()+ book1.getYearCreate());
        Book book2 = new Book("Литвак ", "Михаил ", "Психология ", 2025);
        System.out.println(book2.getFirstNameAuthor()+book1.getNameAuthor()+ book2.getNameBook()+ book2.getYearCreate());
        book2.setYearCreate(2011);
        System.out.println(book2.getFirstNameAuthor()+book1.getNameAuthor()+ book2.getNameBook()+ book2.getYearCreate());
    }

}
