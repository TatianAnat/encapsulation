package com.skypro.account.v3;

public class Account {
    private String name;
    private int balance;

    public Account(String name, int balance) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("имя пусто!");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("баланс отрицательный!");
        }
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("баланс отрицательный!");
        }
        this.balance = balance;
    }

    public String toString() {
        return "(" + name + " имеет " + balance + ")";
    }
}
