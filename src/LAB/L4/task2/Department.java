package LAB.L4.task2;

import java.util.ArrayList;

public class Department
{
    public int year;
    public String name;
    public String shortname;
    private ArrayList<Student> students;

    public Department(String name, String shortname, int year)
    {
        this.year = year;
        this.name = name;
        this.shortname = shortname;
        students = new ArrayList<>();
    }

    public void enroll(Student student)
    {
        this.students.add(student);
    }

    public void remove(Student student)
    {
        this.students.remove(student);
    }

    public void getStudentList()
    {
        for (Student student : students)
        {
            System.out.println(student);
        }
    }


}
