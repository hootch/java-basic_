package poly.diamond;

public class DiamondMain1 {
    public static void main(String[] args) {
        InterfaceA ch1 = new Child();
        ch1.methodA();
//        ch1.methodB();
        ch1.methodCommon();

        InterfaceB ch2 = new Child();
        ch2.methodB();
        ch2.methodCommon();

        InterfaceA[] interfaceAs = {ch1, (Child)ch2};

        for (InterfaceA interfaceA : interfaceAs) {
            interfaceA.methodA();
        }


        Child c = new Child();
        c.methodCommon();

    }
}
