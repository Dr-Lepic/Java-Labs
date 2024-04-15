package LAB.L4.example1;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculatePerimeter() {
        return 2 * (this.length + this.width);
    }
}

