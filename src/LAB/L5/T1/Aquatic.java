package LAB.L5.T1;

public class Aquatic extends Animal
{
    double finLength;
    String boneType;

    public Aquatic(String name, String species, int age, double finLength, String boneType)
    {
        super(name, species, age);
        this.finLength = finLength;
        this.boneType = boneType;
    }

    public void swim()
    {
        System.out.println("It can Swim!");
    }
}
