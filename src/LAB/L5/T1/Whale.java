package LAB.L5.T1;

public class Whale extends Aquatic implements WhatEat,Habitant
{
  public void whatEat()
  {
      System.out.println("Whale eats others");
  }
  public void habitant()
  {
      System.out.println("Whale lives in salty water");
  }

    public Whale(String name, String species, int age, double finLength, String boneType)
    {
        super(name, species, age, finLength, boneType);
    }

}
