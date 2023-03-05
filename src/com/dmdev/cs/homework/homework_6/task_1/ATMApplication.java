package com.dmdev.cs.homework.homework_6.task_1;

public class ATMApplication {
    public static void main(String[] args) {
        ATM atm = new ATM(1000, 500, 200);

        System.out.println(990 % 10);

        System.out.println(atm.withdrawMoney(50000));
        System.out.println(atm.withdrawMoney(990));
        System.out.println(atm.withdrawMoney(330));
        System.out.println(atm.withdrawMoney(29000));

        atm.addMoney(50, 1000);
        atm.addMoney(20, 1000);
        System.out.println(atm.getBalance());

        System.out.println(atm.withdrawMoney(50000));
        System.out.println(atm.withdrawMoney(29000));


    }
}
