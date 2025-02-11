package access.b;

import access.a.Data;

public class AccessOuterMain {
    public static void main(String[] args) {
        Data data = new Data();
        data.publicF = 1;
        data.publicMethod();


//        data.defaultF = 2;
//        data.defaultMethod();


//        data.privateF = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
