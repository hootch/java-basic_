package access.ex;

public class CounterMain
{
    public static void main(String[] args)
    {
        MaxCounter c = new MaxCounter(0, 3);

        System.out.println(c.getCount());
        c.increment();
        System.out.println(c.getCount());
        c.increment();
        System.out.println(c.getCount());
        c.increment();
        System.out.println(c.getCount());
        c.increment();


    }
}
