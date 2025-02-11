package memory.static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Data2 d1 = new Data2("A", counter);
        System.out.println("A count : " + counter.count);

        Data2 d2 = new Data2("b", counter);
        System.out.println("B count : " + counter.count);

        Data2 d3 = new Data2("c", counter);
        System.out.println("c count : " + counter.count);
    }
}
