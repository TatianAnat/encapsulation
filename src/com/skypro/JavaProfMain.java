package com.skypro;

import com.skypro.account.v2.Account;
import com.skypro.account.v4.TransverUtil;

public class JavaProfMain {

    public static void main(String[] args) {
        System.out.println("Skypro Uni - Java Profession start!");
        transferMoneyV1();
        transferMoneyV2();
        transferMoneyV3();
        transferMoneyV4();
    }

    public  static void  transferMoneyV1() {
        System.out.println("JavaProfMain.transferMoneyV1");
        String fromName = "Ivan";
        int fromBalance = 100;

        String toName = "Petr";
        int toBalance = 30;

        int amount = 20;

        System.out.println(fromName + " имеет " + fromBalance);
        System.out.println(toName + " имеет " + toBalance);

        System.out.println(fromName + " передает " + toName + " " + amount);

        fromBalance = fromBalance - amount;
        toBalance = toBalance + amount;

        System.out.println(fromName + " имеет " + fromBalance);
        System.out.println(toName + " имеет " + toBalance);
    }

    public static void transferMoneyV2() {
        System.out.println("JavaProfMain.transferMoneyV2");
        Account ivan = new Account();
        ivan.name = "Ivan";
        ivan.balance = 100;
        Account petr = new Account();
        petr.name = "Petr";
        petr.balance = 50;

        int amount = 20;

        System.out.println(ivan.name + " имеет " + ivan.balance);
        System.out.println(petr.name + " имеет " + petr.balance);

        System.out.println(ivan.name + " передает " + petr.name + " " + amount);

        ivan.balance = ivan.balance - amount;
        petr.balance = petr.balance + amount;

        System.out.println(ivan.name + " имеет " + ivan.balance);
        System.out.println(petr.name + " имеет " + petr.balance);
    }

    public static void transferMoneyV3() {
        com.skypro.account.v3.Account ivan = new com.skypro.account.v3.Account("Ivan",100);
        com.skypro.account.v3.Account petr = new com.skypro.account.v3.Account("Petr",20);
        int amount = 20;

        System.out.println(ivan);
        System.out.println(petr);

        System.out.println(ivan + " передает " + petr + " " + amount);
        ivan.setBalance(ivan.getBalance() - amount);
        petr.setBalance(petr.getBalance() + amount);

        System.out.println(ivan);
        System.out.println(petr);
    }

    public static void transferMoneyV4() {
        System.out.println("JavaProfMain.transferMoneyV4");
        com.skypro.account.v4.Account ivan = new com.skypro.account.v4.Account("Ivan",100);
        com.skypro.account.v4.Account petr = new com.skypro.account.v4.Account("Petr",20);
        int amount = 20;

        System.out.println(ivan);
        System.out.println(petr);

        TransverUtil.transferMoney(ivan, petr, amount);
        System.out.println(ivan);
        System.out.println(petr);
    }
}