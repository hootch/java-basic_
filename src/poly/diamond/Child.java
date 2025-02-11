package poly.diamond;

public class Child implements InterfaceB, InterfaceA{

    @Override
    public void methodA() {
        System.out.println("MethodA");
    }

    @Override
    public void methodB() {
        System.out.println("MethodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("MethodCommon");
    }
}
