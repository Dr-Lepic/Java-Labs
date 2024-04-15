package LAB.L4.task1;

public class Student {
    private String name;
    private int age;
    private double GPA;
    private String ID;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getGPA()
    {
        return GPA;
    }

    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }


    public String getID()
    {
        return ID;
    }

    public void setID(String iD)
    {
        ID = iD;
    }

    public Student(String name, int age, double gpa, String iD)
    {
        this.name = name;
        this.age = age;
        if (isValidGPA(gpa))
        {
            this.GPA = gpa;
        }
        else
        {
            System.out.println("Invalid GPA For: "+ this.name);

        }

        if (isValidID(iD))
        {
            this.ID = iD;
        }
        else
        {
            System.out.println("Invalid ID For: "+ this.name);
        }
    }

    private boolean isValidID(String ID)
    {
        if (ID.matches("\\d{2}00\\d{3}\\d{2}") && ID.length() == 9)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private boolean isValidGPA(double GPA)
    {
        if (GPA >= 0.00 && GPA <= 4.00)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
