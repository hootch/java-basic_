package oop1;

public class ValueDataMain1 {
    public static void main(String[] args) {
        ValueData valData = new ValueData();

        add(valData);
        add(valData);
        add(valData);

    }

    static void add(ValueData val) {
        val.val++;
        System.out.println(val.val);
    }
}
