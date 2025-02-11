package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main stop");
    }

    static void method1() {
        System.out.println("method1 start");
        Data d1 = new Data(10);
        method2(d1);
        System.out.println("method1 stop");
    }

    private static void method2(Data d2) {
        System.out.println("method2 start");
        System.out.println("value : " + d2.getVlaue());
        System.out.println("method2 stop");
    }
}
