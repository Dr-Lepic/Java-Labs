package LAB.L5.T1;

public class Bird extends Animal{

    private double wingspan;
    String wingColor;

    public double getWingspan()
    {
        return wingspan;
    }

    public void setWingspan(double wingspan)
    {
        this.wingspan = wingspan;
    }

    Bird(String name, String species, int age, double wingspan, String wingColor)
    {
        super(name,species,age);
        this.wingspan = wingspan;
        this.wingColor = wingColor;
    }
    public void fly()
    {
        System.out.println("Bird can fly");
    }

    public void buildNest()
    {
        System.out.println("It is building a nest");
    }
    public void getDetails()
    {
        System.out.println("name: "+name);
        System.out.println("Species: "+species);
        System.out.println("age: "+age);
        System.out.println("color: "+wingColor);

    }
}
