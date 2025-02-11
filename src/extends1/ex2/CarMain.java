package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {

        GasCar g = new GasCar();
        ElectricCar ec = new ElectricCar();

        g.move();
        ec.move();

        g.fillUp();
        ec.charge();

    }
}
