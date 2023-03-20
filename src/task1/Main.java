package task1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Михаил Ефимович Литвак ", "Психологическое айкидо ", 2011);
        Book book2 = new Book("Александр Мелентьевич Волков ", "Волшебник Изумрудного города ", 2025);
        System.out.println(book1.getNameAuthor()+book1.getNameBook()+book1.getYearCreate());
        System.out.println(book2.getNameAuthor()+book2.getNameBook()+book2.getYearCreate());
        book2.setYearCreate(1939);
        System.out.println(book2.getNameAuthor()+book2.getNameBook()+book2.getYearCreate());

    }

}
