package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child(10);
//        poly.childMethod(); //불가


        //일시적 다운캐스팅 - 해당 메서드를 호출 하는 순간 다우내스팅
        ((Child)poly).childMethod();
        System.out.println(((Child)poly).val);



    }
}
