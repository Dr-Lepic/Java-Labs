package LAB.L3;

public class Equipment
{
    String Manufacturer;
    int Year;
    int serial;
    double cost;
    Audio audio;
    Video video;

    Equipment(String manufacturer, int year, int serial, double cost, Audio audio)
    {
        this.Manufacturer=manufacturer;
        this.serial=serial;
        this.Year=year;
        this.cost=cost;
        this.audio=audio;
    }

    Equipment(String manufacturer, int year, int serial, double cost, Video video)
    {
        this.Manufacturer=manufacturer;
        this.serial=serial;
        this.Year=year;
        this.cost=cost;
        this.video=video;
    }
    Equipment()
    {

    }
    void depreciation()
    {
        double deprec=cost;
                for(int i=1;i<=Year;i++)
                {
                    deprec=deprec-deprec*0.2;
                }
        System.out.println(deprec);
    }
    void printAll()
    {
        System.out.println("Manufacturer= "+Manufacturer+"\n" + "serial= "+serial+"\n"+"Year= "+Year+"\n"+"cost= "+cost+"\n");
    }
}
