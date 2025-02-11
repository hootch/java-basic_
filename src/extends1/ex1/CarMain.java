package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar();
        ec1.move();
        ec1.charge();

        GasCar gas = new GasCar();
        gas.move();
        gas.move();
    }
}
