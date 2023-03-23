package task1;


public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Пушкин ", "Александр Сергеевич ");
        Book book1 = new Book(author1, "Капитанская дочка ", 1836);
        System.out.println(author1.getFirstNameAuthor()+author1.getNameAuthor()+book1.getNameBook()+book1.getYearCreate());
        Author author2 = new Author("Литвак ","Михаил Ефимович ");
        Book book2 =new Book(author2, "Психологическое айкидо ",2025);
        System.out.println(author2.getFirstNameAuthor()+author2.getNameAuthor()+book2.getNameBook()+book2.getYearCreate());
        book2.setYearCreate(2011);
        System.out.println(author2.getFirstNameAuthor()+author2.getNameAuthor()+book2.getNameBook()+book2.getYearCreate());
    }

}
