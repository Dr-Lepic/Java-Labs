package LAB.L3.e;
public class Member
{
    int ID;
    String Name;
    String Address;

    void showDetails()
    {
        System.out.println(ID+"\n"+Name+"\n"+Address);
    }

    Member()
    {

    }
    Member(int id, String name, String address)
    {
        ID=id;
        Name=name;
        Address= address;
    }
}
