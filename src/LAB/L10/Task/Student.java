package L10.Task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String ID;
    private String name;
    private String address;
    private String  residenceStatus;
    private String mobile;

    public Student(String ID, String name, String address, String mobile) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        //this.residenceStatus = residenceStatus;
        this.mobile = mobile;
        storeStudentInFile(this);
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

    public String  getResidenceStatus() {
        return residenceStatus;
    }

    public void setResidenceStatus(String residenceStatus) {
        this.residenceStatus = residenceStatus;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public void storeStudentInFile(Student s){
        try {
            String filepath = "./students.txt";
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath));

            bufferedWriter.append(s.getID()+ "," + s.getName() + ","
                    + s.getAddress() + "," + s.getResidenceStatus() + "," + s.getMobile() + "\n");

            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
