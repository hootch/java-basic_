package oop1.ex;

public class AccountMain1 {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.deposit(10000);
        acc.showBalance();
        acc.withdraw(100000000);
        acc.showBalance();
        acc.withdraw(100);
        acc.showBalance();
    }
}
