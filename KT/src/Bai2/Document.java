package Bai2;

public class Document {
    protected String id;
    protected String name;
    protected String publisher;
    protected String price;
    public Document(){}


    public Document(String id, String name, String publisher, String price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
