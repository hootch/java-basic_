package poly.ex5;


import poly.ex2.Animal;
import poly.ex4.AbstractAnimal;

public class Pig extends Animal implements InterfaceAnimal {



    @Override
    public void move() {
        System.out.println("돼지 이동");
    }
}
