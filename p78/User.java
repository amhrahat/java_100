package p78;
public class User{
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1,"Rahat");
        BankAccount userAccount2 = new BankAccount(1,"Rahat");

        userAccount.withdraw(10);
        userAccount.deposit(20);
        userAccount.deposit(10);
        userAccount.withdraw(15);
        userAccount.withdraw(25);
        userAccount.withdraw(15);
        userAccount2.getBalance();

    }
}