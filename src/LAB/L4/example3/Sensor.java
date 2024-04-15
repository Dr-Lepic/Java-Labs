package LAB.L4.example3;

public class Sensor {
    private boolean isActivated;

    public Sensor() {
        this.isActivated = false;
    }

    public void activate() {
        isActivated = true;
        System.out.println("Sensor activated");
    }

}
