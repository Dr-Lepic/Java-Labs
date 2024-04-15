package LAB.L5.T1;

public class Main
{
    public static void main(String[] args)
    {
        //part1
        Bird parrot = new Bird("parrot", "Bird", 2,1.3, "Green");
        parrot.fly();
        parrot.buildNest();
        parrot.eat();
        parrot.getDetails();

        //part2
        Whale whale1 = new Whale("John","Whale", 12, 34.6, "Spongy");
        whale1.whatEat();
        whale1.habitant();
    }
}
