package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
//        poly.childMethod(); //불가

        // 다운 캐스팅(부모 -> 자식)
        Child child = (Child) poly;
        child.childMethod();

    }
}
