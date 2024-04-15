package LAB.L5.T2;

public class Circle extends Shape
{
    double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }
    void area()
    {
        double area = 3.14*radius*radius;
        System.out.println(area);
    }

    void perimeter()
    {
        double perimeter= 2*3.14*radius;
        System.out.println(perimeter);
    }
}
