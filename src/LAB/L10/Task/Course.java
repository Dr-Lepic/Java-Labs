package LAB.L10.Task;

public class Course {
    public String code;
    public String name;
    public float credit;
    public COURSEtype type;
    private int semester;

    public Course(String code, String name, float credit, COURSEtype type) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.type = type;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return
                "code='" + code +
                ", name='" + name +
                ", credit=" + credit +
                ", type=" + type +
                ", semester=" + semester;
    }
}
