package Test.Quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Writer {
    String firstName;
    String lastName;
    String age;
    String address;

    public Writer(String firstName, String lastName, String age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void readFile(ArrayList<Writer> list){
        try{
            BufferedReader br = new BufferedReader(new FileReader("courses.txt"));
            String line;
            while ((line = br.readLine())!=null){
               String[] tokens = line.split(";| +");
//               String[] token1 = tokens[0].split(" +");
//                list.add(new Writer(token1[0], token1[1],tokens[1],tokens[2]));
                list.add(new Writer(tokens[0], tokens[1],tokens[2],tokens[3]));
                br.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printFile(ArrayList<Writer> list){
        for (Writer w : list){
            System.out.println(w);
        }
    }

    public static void main(String[] args) {
        ArrayList<Writer> list = new ArrayList<>();

        readFile(list);
        printFile(list);

    }

}
