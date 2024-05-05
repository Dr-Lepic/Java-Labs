package LAB.L9.Task;

public class Course {
    public String code;
    public String name;
    public float credit;
    public COURSEtype type;
    private int marks;

    public Course(String code, String name, float credit, COURSEtype type, Semester semester) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.type = type;
        semester.courses.add(this);
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return
                "code='" + code +
                ", name='" + name +
                ", credit=" + credit +
                ", type=" + type +
                ", marks=" + marks;
    }
}
