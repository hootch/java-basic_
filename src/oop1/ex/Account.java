package oop1.ex;

public class Account
{
    int bal;

    int deposit(int amount)
    {
        bal += amount;
        return bal;
    }

    int withdraw(int amount)
    {
        if (bal >= amount) {
            bal -= amount;
            return bal;
        }
        System.out.println("잔액 부족");
        return bal;
    }

    void showBalance()
    {
        System.out.println(bal);
    }

}
