package Home_Task_Netology.Eleven.Банковские_счета.accounts;

public class SavingsAccount extends Account {
    public SavingsAccount(String name, int balance) {
        super(name, balance);
    }

    @Override
    public void transfer(Account account, int amount) {
        if (getBalance() - amount >= 0 && account.isAddMoneyImpossible(amount)) {
            account.setBalance(amount);
            setBalance(- amount);
            System.out.println("На баланс счёта \"" + account.getName() + "\" переведена сумма: " + amount);
            showBalance();
        } else {
            showError("Недостаточно средств/невозможно выполнить операцию");
        }
    }

    public void addMoney(int amount) {
        if (amount > 0) {
            setBalance(amount);
            System.out.println("Баланс сберегательного счёта \"" + getName() + "\" пополнен на сумму: " + amount);
            showBalance();
        } else {
            showError("Ошибка выполнения");
        }
    }

}


// TODO со сберегательного счета нельзя платить, только переводить и пополнять.
//TODO Также сберегательный не может уходить в минус.