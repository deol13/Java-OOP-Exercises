package se.lexicon.Encapsulation;

// Exercise 12
public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public void deposit(double sum) {
        if(sum > 0 ) {
            balance += sum;
        }
    }

    public void withdraw(double sum) {
        if(sum > 0 && sum <= balance)  {
            balance -= sum;
        }
    }
}
