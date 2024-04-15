package LAB.L4.task2;

public class Main {
    public static void main(String[] args)
    {
        Department cse = new Department("Computer Science and Engineering", "CSE", 1998);

        Student s1 = new Student("Rahim", 19 , 3.60 , "220042190");
        Student s2 = new Student("Coner", 22 , 3.80 , "220042134");

        cse.enroll(s1);
        cse.enroll(s2);

        cse.getStudentList();

        cse.remove(s2);

        System.out.println("After: ");
        cse.getStudentList();
    }


}
