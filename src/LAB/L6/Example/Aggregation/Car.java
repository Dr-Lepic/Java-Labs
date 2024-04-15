package LAB.L6.Example.Aggregation;;

public class Car {
    private String name;
    private Wheel wheel;
    public Car(String name, Wheel wheel) {
        this.name = name;
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Wheel getWheel() {
        return wheel;
    }
}
