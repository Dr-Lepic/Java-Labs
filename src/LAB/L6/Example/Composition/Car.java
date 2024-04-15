package LAB.L6.Example.Composition;

public class Car {
    private String name;
    private Wheel wheel;
    public Car(String name, String  wheelName) {
        this.name = name;
        this.wheel = new Wheel(wheelName);
    }

    public String getName() {
        return name;
    }

    public void setWheel(String  wheelName) {
        this.wheel = new Wheel(wheelName);
    }
}
