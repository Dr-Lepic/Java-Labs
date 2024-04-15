package LAB.L7.Scenario2;

import java.util.Scanner;

public class PhoneNumber{
    public static void isValidPhoneNumber(String phoneNumber) throws MobileNumberValidator{
        if(phoneNumber.matches("\\+880\\-\\d{4}\\-\\d{6}") ){
            System.out.println("Valid phone number: " + phoneNumber);
        }
        else{
            throw new MobileNumberValidator("Invalid phone number: " + phoneNumber);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the phone number: ");
        String phoneNumber = sc.nextLine();

        try {
            isValidPhoneNumber(phoneNumber);
        }
        catch (MobileNumberValidator e) {
            System.out.println(e.getMessage());
        }
    }
}
