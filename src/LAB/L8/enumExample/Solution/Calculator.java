package L8.enumExample.Solution;

import java.util.Scanner;

public class Calculator {
    int a,b;
    Operation operation;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public static Operation convertStringToEnum(String choice){
        return Operation.valueOf(choice);
    }

    public void performOperation(Operation operation) {
        switch (operation) {
            case ADD:
                int sum = a + b;
                System.out.println("Sum: "+ sum);
                break;
            case SUBTRACT:
                int sub = a-b;
                System.out.println("Subtract: "+ sub);
                break;
            case MULTIPLY:
                int result = a * b;
                System.out.println("Result: " + result);
                break;
            case DIVISION:
                double result1 = (double) a / b;
                System.out.println("Result: " + result1);
                break;
        }
    }

    public static void main(String[] args) {
        int a, b;
        String  option;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        b = sc.nextInt();

        System.out.println("Write Choice: ");
        option = sc.next();


        Calculator calculator = new Calculator(a, b);
        calculator.performOperation(Operation.valueOf(option));
    }
}
