package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {

        GasCar g = new GasCar();
        ElectricCar ec = new ElectricCar();
        HydrogenCar hCar = new HydrogenCar();

        g.move();
        g.fillUp();
        g.openDOor();

        ec.charge();
        ec.move();
        ec.openDOor();

        hCar.fillHydrogen();
        hCar.openDOor();
        hCar.move();



    }
}
