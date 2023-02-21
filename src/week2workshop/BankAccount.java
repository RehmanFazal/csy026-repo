package week2workshop;

public class BankAccount {
    private String accountName;
    private double balance;

    public BankAccount() {}

    public BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double checkBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance = this.checkBalance() + amount;
    }

    public void withdraw(double amount) {
        if(this.checkBalance() > amount) this.balance = this.checkBalance() - amount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Fazal", 100);
        bankAccount.deposit(50);
        bankAccount.withdraw(10);
        System.out.println(bankAccount.checkBalance());
    }
}
