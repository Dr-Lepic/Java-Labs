package LAB.L4.example2;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3, 6);
        System.out.println("Length: " + rec.getLength());
        System.out.println("Width: " + rec.getWidth());
        System.out.println("Perimeter: " + rec.calculatePerimeter());
    }
}
