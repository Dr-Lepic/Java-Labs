package LAB.L6.Task.Scenario1;

import java.util.ArrayList;

public class Seller {
    private String sellerName;

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Seller(String sellerName) {
        this.sellerName = sellerName;
    }

    ArrayList<Product> products = new ArrayList<>();
    public void addProduct(String name, double price, String description, String category)
    {
        products.add(new Product(name, price,description, category ));
    }

    void sellTo(Product product, Customer customer)
    {
        customer.purchase(product);
        products.remove(product);
    }

}
