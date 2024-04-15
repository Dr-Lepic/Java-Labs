package LAB.L5.T1;

public class Fish extends Aquatic implements WhatEat, Habitant
{
    public void habitant()
    {
        System.out.println("Fish can live in both salt and fresh water");
    }
    public void whatEat()
    {
        System.out.println("Fish eat zooplankton");
    }

    public Fish(String name, String species, int age, double finLength, String boneType) {
        super(name, species, age, finLength, boneType);
    }
}
