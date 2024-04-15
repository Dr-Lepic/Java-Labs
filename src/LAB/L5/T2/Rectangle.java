package LAB.L5.T2;

public class Rectangle extends Shape
{
    double width;
    double length;

    public Rectangle(String name, String color, double width, double length) {
        super(name, color);
        this.width = width;
        this.length = length;
    }
    void area() {
        double area= length*width;
        System.out.println(area);
    }

    void perimeter()
    {
        double perimeter= 2*(length+width);
        System.out.println(perimeter);
    }
}
