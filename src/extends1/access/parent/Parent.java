package extends1.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod(){
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod(){
        System.out.println("Parent.protectedMethod");
    }
    void defaultMethod(){
        System.out.println("Parent.defaultMethod");
    }
    private void privateMethod(){
        System.out.println("Parent.privateMethod");
    }

    public void printParent(){
        System.out.println("==Parent 메서드 ===");
        System.out.println("public value : " + publicValue );
        System.out.println("protected value : " + protectedValue );
        System.out.println("default value : " + defaultValue );
        System.out.println("private value : " + privateValue );

        defaultMethod();
        privateMethod();

    }

}
