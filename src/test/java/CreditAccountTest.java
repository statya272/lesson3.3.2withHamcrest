import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreditAccountTest {

    @Test
    void addMoney() {
        CreditAccount ca = new CreditAccount();
        ca.balance = -1000;
        int amount = 300;
        int expBalance = -700;

        ca.addMoney(amount);

        Assertions.assertEquals(expBalance, ca.balance);
    }

    @Test
    void debitCheck() {
        CreditAccount ca = new CreditAccount();
        int amount = 200;

        boolean result = ca.debitCheck(amount);

        Assertions.assertFalse(result);
    }
}