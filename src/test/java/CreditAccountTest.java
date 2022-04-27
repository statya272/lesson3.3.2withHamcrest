import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CreditAccountTest {

    @Test
    void addMoney() {
        CreditAccount ca = new CreditAccount();
        ca.balance = -1000;
        int amount = 300;
        int expBalance = -700;

        ca.addMoney(amount);

//        Assertions.assertEquals(expBalance, ca.balance);
        assertThat(ca.balance, equalTo(expBalance));
    }

    @Test
    void debitCheck() {
        CreditAccount ca = new CreditAccount();
        int amount = 200;

//        Assertions.assertFalse(result);
        assertThat(ca.debitCheck(amount), is(false));
    }
}