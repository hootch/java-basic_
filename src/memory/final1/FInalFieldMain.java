package memory.final1;

public class FInalFieldMain {
    public static void main(String[] args) {
    ConstructInit cost1 = new ConstructInit(10);
    ConstructInit cost2 = new ConstructInit(20);
    System.out.println(cost1.value);
    System.out.println(cost2.value);


    FieldINit f1 = new FieldINit();
    FieldINit f2 = new FieldINit();
    FieldINit f3 = new FieldINit();

    System.out.println(f1.value);
    System.out.println(f2.value);
    System.out.println(f3.value);
    System.out.println("-------------------------------------");


        System.out.println(FieldINit.CONST_VALUE);

    }
}
