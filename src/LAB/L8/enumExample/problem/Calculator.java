package LAB.L8.enumExample.problem;

import java.util.Scanner;

public class Calculator {
    int a,b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void performOperation(int operation) {
        switch (operation) {
            case 1:
                int sum = a + b;
                System.out.println("Sum: "+ sum);
                break;
            case 2:
                int sub = a-b;
                System.out.println("Subtract: "+ sub);
                break;
            case 3:
                int result = a * b;
                System.out.println("Result: " + result);
                break;
            case 4:
                double result1 = (double) a / b;
                System.out.println("Result: " + result1);
                break;
        }
    }
    public static void main(String[] args) {
        int a,b,option;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        a = sc.nextInt();
        System.out.println("Enter Second Number:");
        b = sc.nextInt();

        Calculator calculator = new Calculator(a,b);

        System.out.println("Enter option: ");
        option = sc.nextInt();

        calculator.performOperation(option);
    }
}
