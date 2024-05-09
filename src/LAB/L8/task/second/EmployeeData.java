package LAB.L8.task.second;

public class EmployeeData {
    private String name;
    private String address;
    private String description;

    public EmployeeData(String name, String address, String description) {
        this.name = name;
        this.address = address;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }
}
