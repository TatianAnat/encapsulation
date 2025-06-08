package com.skypro.account.v4;

public class TransverUtil {

    public static void transferMoney(Account from, Account to, int amout) {
        System.out.println(new TransverAction(from.name, to.name, amout));
        from.setBalance(from.balance - amout);
        to.setBalance(to.balance + amout);
    }
}
