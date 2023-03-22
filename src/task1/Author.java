package task1;

public class Author {
    private final String firstNameAuthor;
    private final String nameAuthor;


    public Author (String firstNameAuthor, String nameAuthor) {
        this.firstNameAuthor = firstNameAuthor;
        this.nameAuthor = nameAuthor;
    }

    public String getFirstNameAuthor() {
        return firstNameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }
}