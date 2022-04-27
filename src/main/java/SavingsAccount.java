public class SavingsAccount extends Account {
    @Override
    public void pay(int amount) {
        System.out.println("Не корректная операция для текущего счета");
    }

    @Override
    public void transfer(Account account, int amount) {
        if (account.debitCheck(amount) && this.creditCheck(amount)) {
            account.balance += amount;
            this.balance -= amount;
            System.out.println("Выполнен перевод на сумму: " + amount + ". Баланс: " + this.balance);
        } else {
            System.out.println("Невозможно выполнить операцию");
        }
    }

    @Override
    public void addMoney(int amount) {
        this.balance += amount;
        System.out.println("Баланс пополнен на сумму: " + amount + ". Баланс: " + this.balance);
    }

    @Override
    public boolean debitCheck(int amount) {
        return true;
    }

    @Override
    public boolean creditCheck(int amount) {
        return (this.balance - amount) >= 0;
    }
}
