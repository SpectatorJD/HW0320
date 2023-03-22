package task1;

public class Main {
    public static void main(String[] args) {
        Author authorBook1 = new Author("Пушкин ", "Александр Сергеевич ");
        Book book1 = new Book("Капитанская дочка ",1836);
        System.out.println(authorBook1.getFirstNameAuthor()+authorBook1.getNameAuthor()+book1.getNameBook()+book1.getYearCreate());
        Author authorBook2 = new Author("Литвак ", "Михаил Ефимович ");
        Book book2 = new Book("Психологическое айкидо ", 2025);
        System.out.println(authorBook2.getFirstNameAuthor()+authorBook2.getNameAuthor()+book2.getNameBook()+book2.getYearCreate());
        book2.setYearCreate(2011);
        System.out.println(authorBook2.getFirstNameAuthor()+authorBook2.getNameAuthor()+book2.getNameBook()+ book2.getYearCreate());
    }

}
