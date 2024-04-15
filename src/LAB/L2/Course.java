package LAB.L2;
class Course
{
    int code;
    String Cname;

    Course()
    {
        code=0;
        Cname="";
    }
    Course(int cod)
    {
        code=cod;
        Cname="";
    }
    Course(String na)
    {
        Cname=na;
        code=0;
    }
    Course(int cod, String na)
    {
        code=cod;
        Cname=na;
    }
    void displayCourse()
    {
        System.out.println("Course code: "+code);
        System.out.println("Course name: "+Cname);
    }
}
