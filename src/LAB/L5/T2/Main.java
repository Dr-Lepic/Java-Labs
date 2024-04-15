package LAB.L5.T2;

public class Main {
    public static void main(String[] args) {
        //circle
        Circle circle = new Circle("Circle1","Red", 3);

        circle.area();
        circle.perimeter();
        circle.drawShape();

        //rectangle
        Rectangle rectangle = new Rectangle("rectangle1","Blue",10,5);

        rectangle.area();
        rectangle.perimeter();
        rectangle.drawShape();
    }
}
