package access.a;

public class Data {
    public int publicF;
    int defaultF;
    private int privateF;

    public void publicMethod(){
        System.out.println("public " + publicF );
    }

    void defaultMethod(){
        System.out.println("default " + defaultF);
    }

    private void privateMethod(){
        System.out.println("private " + privateF);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicF = 100;
        defaultF = 200;
        privateF = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }

}
