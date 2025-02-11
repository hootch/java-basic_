package memory.static2;


//import static memory.static2.DecoData.staticCall;
import static memory.static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData d1 = new DecoData();
        d1.instanceCall();

        System.out.println("3. 인스턴스 호출 2");
        DecoData d2 = new DecoData();
        d2.instanceCall();




    }
}
