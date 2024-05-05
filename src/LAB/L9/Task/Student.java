package LAB.L9.Task;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String ID;
    private String name;
    private String address;
    private RESIDENCEstatus residenceStatus;
    private String mobile;
    public List<Course> coursesList = new ArrayList<>();

    public Student(String ID, String name, String address, RESIDENCEstatus residenceStatus, String mobile, Semester semester) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.residenceStatus = residenceStatus;
        this.mobile = mobile;
        semester.students.add(this);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RESIDENCEstatus getResidenceStatus() {
        return residenceStatus;
    }

    public void setResidenceStatus(RESIDENCEstatus residenceStatus) {
        this.residenceStatus = residenceStatus;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void addCourse(Course course){
        coursesList.add(course);
    }


    public void setMark(Course course, int marks){
        for(Course c: coursesList)
        {
            if(c==course)
            {
                c.setMarks(marks);
            }
        }
        System.out.println("Marks added: " + marks);
    }

    @Override
    public String toString() {
        return "ID='" + ID +
                ", name='" + name +
                ", address='" + address +
                ", residenceStatus=" + residenceStatus +
                ", mobile='" + mobile;

    }
}
