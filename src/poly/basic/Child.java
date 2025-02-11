package poly.basic;

public class Child extends Parent {
    int val;

    public Child() {
    }
    public Child(int val) {
        this.val = val;
    }

    public void childMethod(){
        System.out.println("Child.childMethod");

    }
}
