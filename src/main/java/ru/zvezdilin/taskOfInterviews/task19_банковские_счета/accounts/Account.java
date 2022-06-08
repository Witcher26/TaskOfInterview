package ru.zvezdilin.taskOfInterviews.task19_банковские_счета.accounts;

public abstract class Account {
    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int sum) {
        balance += sum;
    }

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void pay(int amount) {
        System.out.println("Операция не поддерживается");
        System.out.println(">-----------------------------<");
    }

    public void transfer(Account account, int amount) {

    }

    public void addMoney(int amount) {

    }

    public boolean isAddMoneyImpossible(int amount) {
        return this.getBalance() - amount >= 0;
    }

    public void showError(String text) {
        String red = (char) 27 + "[31m";
        System.out.println(red + "Error (" + text + ")");
        String grey = (char) 27 + "[36m";
        System.out.println(grey + "Баланс счёта \"" + this.getName() + "\": " + this.getBalance());
        System.out.println(">-----------------------------<");
    }

    public void showBalance() {
        System.out.println("Баланс счёта \"" + this.getName() + "\": " + this.getBalance());
        System.out.println(">-----------------------------<");
    }
}
