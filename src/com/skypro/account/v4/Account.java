package com.skypro.account.v4;

public class Account {

    //переменные будут видны только внутри пакета
    String name;
    int balance;

    public Account(String name, int balance) {
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("имя пусто!");
            }
            if (balance < 0) {
                throw new IllegalArgumentException("баланс отрицательный!");
            }
            this.name = name;
            this.balance = balance;
        }

        int getBalance() {
            return balance;
        }

        void setBalance(int balance) {
            if (balance < 0) {
                throw new IllegalArgumentException("баланс отрицательный!");
            }
            this.balance = balance;
        }

    public String toString() {
        return "(" + name + " имеет " + balance + ")";
    }
    }
