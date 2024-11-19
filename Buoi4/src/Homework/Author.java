package Homework;

public class Author{
    private String name;


    public Author(Author author) {
        this.name = author.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
