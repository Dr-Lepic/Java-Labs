package LAB.L2;

class Main
{
    public static void main(String[] args)
    {
        Student st1 = new Student("Mahbub", 21,220042148);
        st1.displayStudent();

        Course Lab= new Course(4202, "OOP Lab");
        Lab.displayCourse();

        Grade mahbub = new Grade(20,30,70,130);
        mahbub.displayGrade();


    }
}
