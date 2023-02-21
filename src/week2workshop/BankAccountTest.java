package week2workshop;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
    BankAccount bankAccount;
    @Before
    public void init() {
        bankAccount = new BankAccount("Fazal", 100);
    }

    @Test
    public void getAccountName() {
       // BankAccount bankAccount = new BankAccount();
        //bankAccount.setAccountName("Fazal");
        assertEquals("Fazal", bankAccount.getAccountName());
    }

    @Test
    public void setAccountName() {
        //already tested
    }

    @Test
    public void getBalance() {
        //BankAccount bankAccount = new BankAccount();
       // bankAccount.setBalance(100);
        assertEquals(100, bankAccount.getBalance(), 0.001);
    }

    @Test
    public void setBalance() {
        //already tested
    }

    @Test
    public void checkBalance() {
        //BankAccount bankAccount = new BankAccount("Fazal", 100);
        double amount = bankAccount.checkBalance();
        assertEquals(100, amount, 0.001);
    }

    @Test
    public void deposit() {
       // BankAccount bankAccount = new BankAccount("Fazal", 100);
        bankAccount.deposit(10);
        assertEquals(110, bankAccount.checkBalance(), 0.001);
    }

    @Test
    public void withdraw() {
       // BankAccount bankAccount = new BankAccount("Fazal", 100);
        bankAccount.withdraw(10);
        assertEquals(90, bankAccount.checkBalance(), 0.001);
    }
}