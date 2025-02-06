package pack;

import pack.a.*;
//import pack.b.User;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        pack.a.User u = new pack.a.User();
        User user = new User();
        User2 u2 = new User2();

        pack.b.User ub = new pack.b.User();


    }
}
