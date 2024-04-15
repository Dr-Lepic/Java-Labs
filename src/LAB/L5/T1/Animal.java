package LAB.L5.T1;

public class Animal
{
    String name;
    String species;
    int age;
   public Animal(String name, String species, int age)
    {
        this.name=name;
        this.species=species;
        this.age=age;
    }

    public void eat()
    {
        System.out.println("It is eating");
    }
}
