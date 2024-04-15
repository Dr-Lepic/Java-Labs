package LAB.L6.Task.Scenario1;

import java.util.ArrayList;

public class Customer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name) {
        this.name = name;
    }

    ArrayList<Review> reviews = new ArrayList<>();
    void addReview(Product product, Review review)
    {
        product.productReview(review);
        reviews.add(review);
    }
    ArrayList<Product> cart = new ArrayList<>();
    public void purchase(Product product)
    {
        cart.add(product);
        System.out.println("Added to cart for purchasing");
       // Seller.sellTo(product);

    }
}
