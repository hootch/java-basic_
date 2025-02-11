package memory.static1;

public class DataCountMain3 {
    public static void main(String[] args) {

        Data3 d1 = new Data3("A");
        System.out.println("A count : " + Data3.count);

        Data3 d2 = new Data3("b");
        System.out.println("B count : " + Data3.count);

        Data3 d3 = new Data3("c");
        System.out.println("c count : " + Data3.count);
    }
}
