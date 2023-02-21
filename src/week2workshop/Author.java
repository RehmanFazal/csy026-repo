package week2workshop;

import java.util.ArrayList;

public class Author {
    private ArrayList<Book> book;
    private String firstname;
    private String surname;
    private String city;

    public Author() {}

    public Author(ArrayList<Book> book, String firstname, String surname, String city) {
        this.book = book;
        this.firstname = firstname;
        this.surname = surname;
        this.city = city;
    }

    public ArrayList<Book> getBook() {
        return book;
    }

    public void setBook(ArrayList<Book> book) {
        this.book = book;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static void main(String[] args) {
        Book book = new Book("Advance SE", "Computing", 30);
        Book book1 = new Book("Advance AI", "Computing", 30);
        ArrayList<Book> b = new ArrayList<>();
        b.add(book1);
        b.add(book);
        Author author = new Author(b, "Ali", "khan", "Islamabad");

        System.out.println(author.getBook().size());
    }
}
