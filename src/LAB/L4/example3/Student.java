package LAB.L4.example3;

public class Student {
    private final int studentID;
    private String name;

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }


}
