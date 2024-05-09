package LAB.L9.Task;

import LAB.L9.FileExample.Person;

import java.io.*;
import java.util.*;
import java.util.zip.CheckedOutputStream;

public class Semester {
    public int semesterNum;
    List<Course> courses = new ArrayList<>();
    List<Student> students = new ArrayList<>();

    public Semester(int semesterNum) {
        this.semesterNum = semesterNum;
    }

    public void storeStudentInFile(String filepath){
        List<Student> studentList = this.students;
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath));
            for(Student s: studentList)
            {
                bufferedWriter.write(s.getID()+ "," + s.getName() + ","
                        + s.getAddress() + "," + s.getResidenceStatus() + "," + s.getMobile() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
            }
    }

    public void storeCourseInFile(String filepath){
        List<Course> courseList = this.courses;
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath));
            for(Course c: courseList)
            {
                bufferedWriter.write(c.code+ "," + c.name + ","
                        + c.credit + "," + c.type + "," + this.semesterNum + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Student> readStudentFromFile(String filePath){
        List<Student> retrivedStudentList = new ArrayList<>();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = bufferedReader.readLine()) != null)
            {
                String[] values = line.split(",");
                System.out.println("Read from file");
                System.out.println("ID: "+ values[0] + " Name: " + values[1] +
                        " Address: " + values[2] + " residentStatus: " + values[3] + " Mobile: " + values[4]);

                Student student = new Student(values[0],values[1], values[2],RESIDENCEstatus.valueOf(values[3]),values[4], this);
                retrivedStudentList.add(student);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return retrivedStudentList;
    }

    public void printAllMarks()
    {
        for (Student s: students)
        {
            for (Course c: s.coursesList)
            {

            }
        }
    }


}
