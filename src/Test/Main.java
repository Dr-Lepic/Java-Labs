package Test;

enum Color{
    RED,BLUE,GREEN,YELLOW,WHITE;
}

public class Main {


    public static void main(String[] args) {
        for (Color c : Color.values()) {
            System.out.println(c + " : " + c.ordinal());
        }
        System.out.println(Color.valueOf("BLUE"));
    }
}