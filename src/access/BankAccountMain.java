package access;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();
        acc.deposit(10000);
        acc.withdraw(3000);
        System.out.println(acc.getBalance());
    }
}
