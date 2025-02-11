package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {

        GasCar g = new GasCar();
        ElectricCar ec = new ElectricCar();
        HydrogenCar hCar = new HydrogenCar();

        g.move();

        ec.move();

        hCar.move();



    }
}
