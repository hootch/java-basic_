package poly.ex4;


public class Dog extends AbstractAnimal {
    @Override
    public void sound(){
        System.out.println("bow bow");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
