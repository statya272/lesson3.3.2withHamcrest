public class CreditAccount extends Account {
    @Override
    public void pay(int amount) {
        this.balance -= amount;
        System.out.println("Оплата на сумму: " + amount + ". Баланс: " + this.balance);
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Не корректная операция для текущего счета");
    }

    @Override
    public void addMoney(int amount) {
        if (this.debitCheck(amount)) {
            this.balance += amount;
            System.out.println("Баланс пополнен на сумму: " + amount + ". Баланс: " + this.balance);
        } else {
            System.out.println("Невозможно выполнить операцию");
        }
    }

    @Override
    public boolean debitCheck(int amount) {
        return (this.balance + amount) <= 0;
    }

    @Override
    public boolean creditCheck(int amount) {
        return true;
    }
}
