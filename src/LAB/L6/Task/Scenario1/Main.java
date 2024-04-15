package LAB.L6.Task.Scenario1;

public class Main {
    public static void main(String[] args) {

        Seller seller1 = new Seller("Mahbub");
        seller1.addProduct("Phone", 200,"Very good", "5G");

        Customer customer1 = new Customer("Rahim");
        seller1.sellTo(seller1.products.get(0),customer1);

        customer1.addReview(customer1.cart.get(0),new Review("The phone is too FAST", 5));


    }
}
