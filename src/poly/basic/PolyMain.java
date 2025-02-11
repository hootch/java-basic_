package poly.basic;

public class PolyMain {
    public static void main(String[] args) {

        System.out.println(" Parent - > Parent");

        Parent parent = new Parent();
        parent.parentMethod();


        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();


        //부모 변수가 자식 인스턴스 참조

        Parent poly = new Child();
        poly.parentMethod();

//        poly.childMethod(); //자식 기능 호출 불가

        Parent test = child;
        test.parentMethod();

//        Child child1 = new Parent();

    }
}
