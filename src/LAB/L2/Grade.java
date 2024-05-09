package LAB.L2;
class Grade
{
    double attendance;
    double quiz;
    double mid;
    double fin;
    Grade(double a,double b,double c,double d)
    {
        attendance=a;
        quiz=b;
        mid=c;
        fin=d;
    }
    Grade(double a, double b, double c)
    {
        attendance=a;
        quiz=b;
        mid=c;
        fin=0;
    }
    Grade(double a, double b)
    {
        attendance=a;
        quiz=b;
        mid=0;
        fin=0;
    }
    Grade()
    {
        attendance=0;
        quiz=0;
        mid=0;
        fin=0;
    }
    void displayGrade()
    {
        double sum= attendance+quiz+mid+fin;
        float total= (float) ((sum/300)*100);
        if(total>=80)
        {
            System.out.println("A+");
            System.out.println(total+"%");

        }
        else if(75<=total)
        {
            System.out.println("A");
            System.out.println(total+"%");
        }
        else if(70<=total)
        {
            System.out.println("A-");
            System.out.println(total+"%");
        }
        else if(65<=total)
        {
            System.out.println("B+");
            System.out.println(total+"%");
        }
        else if(60<=total)
        {
            System.out.println("B");
            System.out.println(total+"%");
        }
        else if(55<=total)
        {
            System.out.println("B-");
            System.out.println(total+"%");
        }
        else if(50<=total)
        {
            System.out.println("C+");
            System.out.println(total+"%");
        }
        else if(45<=total)
        {
            System.out.println("C");
            System.out.println(total+"%");
        }
        else if(40<=total)
        {
            System.out.println("D");
            System.out.println(total+"%");
        }
        else
        {
            System.out.println("F");
            System.out.println(total+"%");
        }

    }
}
