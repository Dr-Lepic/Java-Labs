package W3sc;
import java.util.Scanner; //to take user input

//a class is a template for objects, and an object is an instance of a class.

//abstract can only be method and the class will be auto abstract. It doesn't have a body. body is defined in the subclass

/*
    Inheritance(extends)
    -subclass (child) - the class that inherits from another class
    -superclass (parent) - the class being inherited from

    when using inheritance have to set an/all attribute of parent class protected.
*/

public class W3sc
{
    final int x=10; // can't modify its value in the obj. it's fixed.final is a modifier.

    //we can access static method/attributes without creating an obj.
    static void myMethod() { //static means that the method belongs to the Main class and not an object of the Main class
        System.out.println("I just got executed!");
    }

    // With method overloading, multiple methods can have the same name with different parameters:
    ///////////////////////////////////////////////////////////////
    static int plusMethod(int x, int y) {
        return x + y;
    }
    //                  used to do the same thing with different data type.
    static double plusMethod(double x, double y) {
       return x + y;
    }
    /////////////////////////////////////////////////////////////

    /*
        Method scope: variables declared inside a method can only be used inside that method
        Block Scope: block of code refers to the code between curly braces {}. they can only be accessed inside{}
    */

    public static void main(String[] args)
    {
        myMethod();//doesn't need to make an obj to use static type method/data

        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};//to declare an array type+[]---- int[], String[]
        //for multi dimensional array **type[][]**

        System.out.println(cars.length);//prints length ... output 4
        //for (int i = 0; i < cars.length; i++)

        for (String i : cars) //for each loop
        {
            System.out.println(i);
        }

        //user input
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();//scans the line
        System.out.println("Username is: " + userName);
        //
    }
}
