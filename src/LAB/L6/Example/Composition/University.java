package LAB.L6.Example.Composition;

public class University {
    private String name;
    private Department department;

    public University(String name, String  departmentName) {
        this.name = name;
        this.department = new Department(departmentName);
    }

    public Department getDepartment() {
        return department;
    }
}
