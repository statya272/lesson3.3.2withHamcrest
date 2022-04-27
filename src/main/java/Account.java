public abstract class Account {
    public int balance = 0;

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract void addMoney(int amount);

    public abstract boolean debitCheck(int amount);

    public abstract boolean creditCheck(int amount);

}