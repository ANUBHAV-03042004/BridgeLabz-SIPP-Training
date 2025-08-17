package junit.bankaccounttransaction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

 @Test
 void testDeposit() {
     BankAccount account = new BankAccount(1000);
     account.deposit(500);
     assertEquals(1500, account.getBalance());
 }

 @Test
 void testWithdrawSuccess() {
     BankAccount account = new BankAccount(1000);
     account.withdraw(400);
     assertEquals(600, account.getBalance());
 }

 @Test
 void testWithdrawInsufficientFunds() {
     BankAccount account = new BankAccount(500);
     assertThrows(IllegalArgumentException.class, () -> account.withdraw(1000));
 }
}
