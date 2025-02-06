package class1;

import class1.ref.BigData;
import class1.ref.Data;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bg = new BigData();
        bg.data = new Data();
        System.out.println(bg.count);
        System.out.println(bg.data);

        System.out.println(bg.data.value);

    }

}
