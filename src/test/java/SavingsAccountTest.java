import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SavingsAccountTest {
    @Test
    void transfer() {
        SavingsAccount sa = new SavingsAccount();
        sa.balance = 1000;
        CheckingAccount ca = new CheckingAccount();
        ca.balance = 1000;
        int amount = 900;
        int expSaBalance = 100;
        int expCaBalance = 1900;

        sa.transfer(ca, amount);

        Assertions.assertEquals(expSaBalance, sa.balance);
        Assertions.assertEquals(expCaBalance, ca.balance);
    }

    @Test
    void addMoney() {
        SavingsAccount sa = new SavingsAccount();
        int amount = 200;
        int expBalance = 200;

        sa.addMoney(amount);

        Assertions.assertEquals(expBalance, sa.balance);
    }

    @Test
    void creditCheck() {
        SavingsAccount sa = new SavingsAccount();
        int amount = 200;

        boolean result = sa.creditCheck(amount);

        Assertions.assertFalse(result);
    }
}