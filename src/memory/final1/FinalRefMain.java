package memory.final1;
import memory.final1.Test;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        System.out.println(data.value);

        data.value = 10;
        System.out.println(data.value);

        data.value = 20;
        System.out.println(data.value);
        Data.data = new Data2();
        System.out.println(Data.data);
        System.out.println("-----------");
        Data.data.name= "name임";
        Test.tteesstt();

    }
}
