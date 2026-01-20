package p78;

public class BankAccount {

    private int accoutNumber;
    private String accountHolderName;
    private int balance;
    
    {
        balance = 0;
    }

    BankAccount(int accoutNumber, String accountHolderName){
        this.accoutNumber = accoutNumber;
        this.accountHolderName = accountHolderName;

        
    }
    
    public int getBalance(){
        return this.balance;
    }

    public void deposit(int addAmount){
        this.balance = this.balance + addAmount;
        System.out.println("New balance " + this.getBalance());
    }

    public void withdraw(int removeAmount){
        if (this.balance - removeAmount >= 0){
            this.balance = this.balance - removeAmount;
        System.out.println("New balance " + this.getBalance());
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    
}
