package class1;

import class1.ref.Data;

public class NullMain1 {
    public static void main(String[] args) {
        Data da = null;
        System.out.println(da);
        da = new Data();
        System.out.println(da);
        da = null;
        System.out.println(da);
    }

}
