package ru.zvezdilin.taskOfInterviews.task19_банковские_счета.accounts;

public class CheckingAccount extends Account {
    public CheckingAccount(String name, int balance) {
        super(name, balance);
    }

    @Override
    public void pay(int amount) {
        if (this.getBalance() - amount >= 0) {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Со счёта: \"" + this.getName() + "\" была переведена сумма: " + amount);
            showBalance();
        } else {
            showError("Недостаточно средств!");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (getBalance() - amount >= 0 && account.isAddMoneyImpossible(amount)) {
            account.setBalance(amount);
            System.out.println("На баланс счёта: \"" + account.getName() + "\" переведена сумма: " + amount);
            showBalance();
        } else {
            showError("Невозможно выполнить транзакцию!");
        }
    }

    @Override
    public void addMoney(int amount) {
        if (amount > 0) {
            setBalance(amount);
            System.out.println("На счёт зачислены средства: " + amount);
            showBalance();
        } else {
            showError("Невозможно добавить отрицательную сумму!");
        }
    }
}
//TODO Расчетный может выполнять все три операции, но не может уходить в минус.