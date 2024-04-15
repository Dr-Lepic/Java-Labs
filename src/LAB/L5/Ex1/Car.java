package LAB.L5.Ex1;
public class Car
{
    int wheels;
    String model;

    Car(int wheels, String model)
    {
        this.wheels=wheels;
        this.model=model;

    }

    void start()
    {
        System.out.println(model + " car moving");
    }

}
