package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{

    @Override
    public void sound() {
        System.out.println("gu gu");
    }

    @Override
    public void fly() {
        System.out.println("pudadak");
    }
}
