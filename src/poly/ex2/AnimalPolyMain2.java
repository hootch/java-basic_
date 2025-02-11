package poly.ex2;



public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        //pig가 오버라이딩을 하지않은 상태
        Animal[] animals = {new Dog(), new Cat(), new Cow(), new Pig()};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    // 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
