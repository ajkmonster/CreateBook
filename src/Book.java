import java.text.DecimalFormat;
import java.text.Format;

public class Book {
    //Create a Book class that allows for Book title, author, description, price and isInStock variables
    //The Book class shall contain private member variables, a default constructor, an overloaded constructor
    // and a method called getDisplayText() which prints the author, title and description.
    //The application shall also contain getters and setters for each private member variable.
    //Create another class called BookApp which contains the main method.
    // In the main method you shall create an instance of a Book and print the Author, Title and Description.
    private String bookTitle;
    private String author;
    private String description;
    private double price;
    private String isInStock;
    public Book(String bookTitle,String author, String description, double price, String isInStock){
super();
this.bookTitle = bookTitle;
this.author =author;
this.description = description;
this.price = price;
this.isInStock = isInStock;
    }
public String getDisplayText(){
    return  "Book Title:         " + getBookTitle() + "\n" +
            "Author:             " + getAuthor() + "\n" +
            "Description:        " + getDescription() + "\n" +
            "In Stock:           " + getIsInStock() + "\n" +
            "Price:              " + this.getFormattedPrice(getPrice()) + "\n";
}

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getIsInStock() {
        return isInStock;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsInStock(String isInStock) {
        this.isInStock = isInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getFormattedPrice(Double price){
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(price);
    }
}
