package LAB.L5.T1;

public class Seal extends Aquatic implements WhatEat,Habitant
{
    public void habitant()
    {
        System.out.println("Lives in both salty or fresh");
    }
    public void whatEat()
    {
        System.out.println("Eats another animal");
    }

    public Seal(String name, String species, int age, double finLength, String boneType)
    {
        super(name, species, age, finLength, boneType);
    }
}
