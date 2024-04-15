package LAB.L7.Scenario1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int [] arr = new int [5];
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);

        try {
            int num = arr[8];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured: " + e.getMessage());
        }


    }


}
