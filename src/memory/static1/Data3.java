package memory.static1;

public class Data3 {
    public String name;
    public int order;
    public static int count;

    public Data3(String name) {
        this.name = name;
        order = ++count;
    }
}
