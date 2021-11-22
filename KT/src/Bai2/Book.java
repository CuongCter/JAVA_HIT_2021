package Bai2;
import java.util.Scanner;
import java.util.ArrayList;
public class Book extends Document{
    private int numberOfPage;
    private String author;
    public Book(){}




    public Book(String id, String name, String publisher, String price, int numberOfPage, String author) {
        super(id, name, publisher, price);
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
