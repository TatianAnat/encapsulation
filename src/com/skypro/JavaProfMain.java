package com.skypro;

public class JavaProfMain {

    public static void main(String[] args) {
        System.out.println("Skypro Uni - Java Profession start!");
        transferMoneyV1();
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
}