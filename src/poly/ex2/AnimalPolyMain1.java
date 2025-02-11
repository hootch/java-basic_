package poly.ex2;



public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }
    private static void soundAnimal(Animal animal){
        System.out.println("시작");
        animal.sound();
        System.out.println("끝");

    }
}
