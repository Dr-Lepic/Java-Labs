package LAB.L5.T2;

abstract public class Shape
{
    private String name;
    private String color;
    abstract void area();
    abstract void perimeter();
    void drawShape()
    {
        System.out.println("Shape is drawn");
    }

    public Shape(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
