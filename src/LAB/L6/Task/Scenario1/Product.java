package LAB.L6.Task.Scenario1;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private String description;
    private String category;

    public Product(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    ArrayList<Review> reviews = new ArrayList<>();

    void productReview(Review review)
    {
        reviews.add(review);
        System.out.println(review.getMessage() +" "+ review.ratingValue);
    }
}
