import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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

//        Assertions.assertEquals(expSaBalance, sa.balance);
//        Assertions.assertEquals(expCaBalance, ca.balance);
        assertThat(sa.balance, equalTo(expSaBalance));
        assertThat(ca.balance, equalTo(expCaBalance));
    }

    @Test
    void addMoney() {
        SavingsAccount sa = new SavingsAccount();
        int amount = 200;
        int expBalance = 200;

        sa.addMoney(amount);

//        Assertions.assertEquals(expBalance, sa.balance);
        assertThat(sa.balance, equalTo(expBalance));
    }

    @Test
    void creditCheck() {
        SavingsAccount sa = new SavingsAccount();
        int amount = 200;

//        Assertions.assertFalse(result);
        assertThat(sa.creditCheck(amount), is(false));
    }
}