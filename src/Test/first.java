class Animal
{
    String type;
    String name;
    int age;
    void eat()
    {
        System.out.println("It is eating!");
    }
    void sleep()
    {
        System.out.println("It is sleeping!");
    }
    Animal(String ty, String nam, int ag)
    {
        type=ty;
        name=nam;
        age=ag;
    }
}


class first
{
    public static void main(String[] args)
    {
        Animal a = new Animal("Dog", "Tom", 99);

        System.out.println(a.name);
        System.out.println(a.type);
        System.out.println(a.age);
        a.eat();
        a.sleep();

        /*
        Animal b = new Animal();g
        this is a test
        */


    }
}