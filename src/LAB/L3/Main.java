package LAB.L3;

public class Main
{
    public static void main(String[] args) {


        Audio d1 = new Audio("CD");
        Video v1 = new Video("Video disk");

        Equipment equipment1 = new Equipment("IUT", 5, 1, 500, d1);
        Equipment equipment2 = new Equipment("IUT", 7, 2, 1500, v1);
        equipment1.depreciation();
        equipment2.depreciation();
        equipment2.printAll();
    }
}
