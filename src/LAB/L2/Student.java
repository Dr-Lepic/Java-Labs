package LAB.L2;
class Student
{
    String name;
    int age;
    int id;

    Student(String na, int ag, int i)
    {
        name=na;
        age=ag;
        id=i;
    }
    Student(String na)
    {
        name=na;
        age=0;
        id=0;
    }
    Student(int ag, int i)
    {
        name=" ";
        age=ag;
        id=i;
    }
    Student(int i)
    {
        name=" ";
        id=i;
        age=0;
    }
    Student()
    {
        name="";
        age=0;
        id=0;
    }
    void displayStudent()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("ID: "+id);
    }
}
