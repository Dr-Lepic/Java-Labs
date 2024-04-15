package LAB.L6.Example.Aggregation;

public class University {
    private String name;
    private Department department;

    public University(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }
}
