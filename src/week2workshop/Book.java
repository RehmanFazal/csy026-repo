package week2workshop;

public class Book {
    private String title;
    private String subject;
    private double price;

    public Book() {}

    public Book(String title, String subject, double price) {
        this.title = title;
        this.subject = subject;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
