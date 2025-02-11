package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

//        Cow[] cowArr = {cow, cat, dog};

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("종료");

        soundCow(cow);
        soundCat(cat);

    }

    private static void soundCow(Cow cow) {
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("종료");
    }
    private static void soundCat(Cat cow) {
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("종료");
    }
}
