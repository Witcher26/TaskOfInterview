package Home_Task_Netology.Eleven.Банковские_счета.accounts;

public class CreditAccount extends Account {
    public CreditAccount(String name, int balance) {
        super(name, balance);
    }

    @Override
    public void pay(int amount) {
        if (amount > 0) {
            this.setBalance(this.getBalance() - amount);
            System.out.println("С баланса кредитного счёта: \"" + getName() + "\" была переведан сумма: " + amount);
            showBalance();
        } else {
            showError("Недостаточно средств");
        }
    }


    public void addMoney(int amount) {
        if (isAddMoneyImpossible(amount)) {
            setBalance(amount);
            System.out.println("На баланс кредитного счёта: \"" + getName() + "\" переведена сумма: " + amount);
            showBalance();
        } else {
            showError("Кредитная карта не может имет положительный баланс");
        }

    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount > 0) {
            setBalance(- amount);
            System.out.println("На баланс счёта: \"" + account.getName() + "\" переведена сумма: " + amount);
            showBalance();
        } else {
            showError("Невозможно выполнить транзакцию!");
        }
    }

    @Override
    public boolean isAddMoneyImpossible(int amount) {
        return getBalance() + amount <= 0;
    }

}
//TODO Кредитный не может иметь положительный баланс – если платить с него, то уходит в минус, чтобы вернуть в 0, надо пополнить его.