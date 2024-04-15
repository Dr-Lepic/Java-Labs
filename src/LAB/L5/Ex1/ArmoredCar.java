package LAB.L5.Ex1;


public class ArmoredCar extends Car implements Floatable, Flyable
{
    public void floatOnWater()
    {
        System.out.println("I can Float!");
    }
    public void fly()
    {
        System.out.println("I can fly!");
    }
    int bulletProofWindows;
    ArmoredCar(int wheels, String model)
    {
        super(wheels,model);
    }

    ArmoredCar(int wheels, String model, int bulletProofWindows)
    {
        super(wheels, model);
        this.bulletProofWindows=bulletProofWindows;
    }

    void remoteStartCar()
    {
        System.out.println(super.model+" car started remotely");
    }

}
