package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct mem1 = new MemberConstruct("abc",1,1);
        MemberConstruct mem2 = new MemberConstruct("bcd",2);
        System.out.println(mem1.name);
        System.out.println(mem2.name);
    }
}
