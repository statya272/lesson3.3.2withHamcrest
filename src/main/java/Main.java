public class Main {

    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount();
        Account creditAccount = new CreditAccount();
        Account checkingAccount = new CheckingAccount();

        System.out.println("Демонстрация сберегательного счета");
        savingsAccount.addMoney(1000); // Добавляем деньги на счет
        savingsAccount.pay(1000); // Нельзя платить с этого счета
        savingsAccount.transfer(checkingAccount, 1100); // Недостаточно средств для перевода
        savingsAccount.transfer(checkingAccount, 500); // Переводим корректную сумму
        savingsAccount.transfer(creditAccount, 500); // Отказ операции от счета-получателя

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();

        System.out.println("Демонстрация кредитного счета");
        creditAccount.pay(1000); // Оплачиваем с кредитного счета
        creditAccount.addMoney(1100); // Баланс на счету становится положительным
        creditAccount.addMoney(500); // Корректная операция
        creditAccount.transfer(checkingAccount, 1000); // Переводы с кредитного счета запрещены

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();

        System.out.println("Демонстрация расчетного счета");
        checkingAccount.addMoney(1000); // Добавили на счет средства
        checkingAccount.pay(1600); // Недостаточно средств для оплаты
        checkingAccount.pay(1000); // Корректная оплата
        checkingAccount.transfer(savingsAccount, 1000); // Недостаточно средств для перевода
        checkingAccount.transfer(savingsAccount, 500); // Перевод выполнен
    }
}
