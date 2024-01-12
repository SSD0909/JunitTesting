package jUnitTestClasses;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import jUnit5Classes.BankAccount;
public class BankAccountTest {
	private BankAccount account;
    private static int count;
    @org.junit.Before
    public void setup() {
        account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }
    @org.junit.Test
    public void deposit()  {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }
    @org.junit.Test
    public void withdraw_branch()  {
        //double balance = account.withdraw(600.00, true);
    	double balance=account.withdraw(400.00, false);
        assertEquals(600.00, balance, 0);
    }
    @org.junit.Test
    public void withdraw_notBranch()  {
        double balance = account.withdraw(600.00, false);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test
    public void getBalance_deposit()  {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw()  {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        assertTrue("The account is NOT a checking account", account.isChecking());
    }




	    
}
