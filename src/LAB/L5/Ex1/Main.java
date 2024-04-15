package LAB.L5.Ex1;

public class Main
{
    public static void main(String[] args) {
        Car car = new Car(4,"BMW");
        car.start();

        ArmoredCar arCar = new ArmoredCar(4,"U.S. T17E1 Staghound",2);
        arCar.remoteStartCar();
        arCar.floatOnWater();
        arCar.fly();
    }
}
