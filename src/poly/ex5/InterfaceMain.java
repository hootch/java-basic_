package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {

//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        Pig pig = new Pig();

        cat.sound();
        dog.sound();
        cow.sound();
        pig.sound();
        System.out.println(cow.tag);
    }
}
