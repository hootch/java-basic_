package poly.ex4;

public class AbstractMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        AbstractAnimal[] animals = {cat,dog,cow};
        for (AbstractAnimal animal : animals) {
            animal.move();
            animal.sound();
        }
    }
}
