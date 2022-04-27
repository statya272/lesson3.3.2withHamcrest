import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckingAccountTest {

    @Test
    void pay() {
        CheckingAccount ch = new CheckingAccount();
        ch.balance = 500;
        int amount = 200;
        int expBalance = 300;

        ch.pay(amount);

        Assertions.assertEquals(expBalance, ch.balance);
    }

    @Test
    void transfer() {
        CheckingAccount ch = new CheckingAccount();
        ch.balance = 1000;
        CheckingAccount ca = new CheckingAccount();
        ca.balance = 1000;
        int amount = 200;
        int expChBalance = 800;
        int expCaBalance = 1200;

        ch.transfer(ca, amount);

        Assertions.assertEquals(expChBalance, ch.balance);
        Assertions.assertEquals(expCaBalance, ca.balance);
    }

    @Test
    void addMoney() {
        CheckingAccount ch = new CheckingAccount();
        int amount = 900;
        int expBalance = 900;

        ch.addMoney(amount);

        Assertions.assertEquals(expBalance, ch.balance);
    }

    @Test
    void creditCheck() {
        CheckingAccount ch = new CheckingAccount();
        int amount = 100;

        boolean result = ch.creditCheck(amount);

        Assertions.assertFalse(result);
    }
}