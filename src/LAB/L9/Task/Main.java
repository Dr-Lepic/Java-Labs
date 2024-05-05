package LAB.L9.Task;

public class Main {
    public static void main(String[] args) {


        Semester semester1 = new Semester(1);
        Student student1 = new Student("1", "Mahbub", "IUT", RESIDENCEstatus.NON_RESIDENCE, "0185853", semester1);
        Student student2 = new Student("2", "Kobi", "IUT", RESIDENCEstatus.RESIDENCE, "01854667", semester1);

        Course OOP = new Course("SWE 4201", "OOP", 3, COURSEtype.THEORY, semester1);
        Course OOPLab = new Course("SWE 4202", "OOPLab", 3, COURSEtype.LAB, semester1);

        semester1.storeStudentInFile("./students.txt");
        semester1.storeCourseInFile("./courses.txt");

        semester1.readStudentFromFile("./students.txt");

        student1.addCourse(OOP);
        student1.addCourse(OOPLab);

        student2.addCourse(OOP);
        student2.addCourse(OOPLab);

        student1.setMark(OOP, 50);



    }
}
