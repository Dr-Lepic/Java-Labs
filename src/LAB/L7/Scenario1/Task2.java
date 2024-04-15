package LAB.L7.Scenario1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();

        double result;
        try {
            if(a>b){
                result = (double) a / b;
            }
            else {
                result = (double) b / a;
            }
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occured: " + e.getMessage());
        }

        String A,B;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        A = sc1.nextLine();
        System.out.println("Enter the second number: ");
        B = sc1.nextLine();

        try{
            int num1 = Integer.parseInt(A);
            int num2 = Integer.parseInt(B);
            System.out.println(num1*num2);
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception Occured: " + e.getMessage());
        }


    }
}
