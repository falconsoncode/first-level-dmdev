package com.dmdev.cs.homework.homework_6.task_1;

public class ATM {

    private int count10;
    private int count20;
    private int count50;

    public ATM(int count10, int count20, int count50) {
        this.count10 = count10;
        this.count20 = count20;
        this.count50 = count50;
    }

    public void addMoney(int denomination, int count) {
        if (denomination == 10) {
            count10 += count;
        } else if (denomination == 20) {
            count20 += count;
        } else {
            count50 += count;
        }
    }

    public boolean withdrawMoney(int amount) {
        if (isMultipleOfTen(amount)) {
            System.out.println("Вы ввели не верную сумму");
            return false;
        }

        if(amount > getBalance()) {
            System.out.println("Операция невозможна");
        }

        int countWithdraw50 = Math.min(amount / 50, count50);
        int remainingAmount = amount - countWithdraw50 * 50;
        int countWithdraw20 = Math.min(remainingAmount / 20, count20);
        remainingAmount -= countWithdraw20 * 20;
        int countWithdraw10 = Math.min(remainingAmount / 10, count10);
        remainingAmount -= countWithdraw10 * 10;

        if (remainingAmount == 0) {
            count50 -= countWithdraw50;
            count20 -= countWithdraw20;
            count10 -= countWithdraw10;
            System.out.println("Сумма: " + amount);
            System.out.println("Выдано купюр номиналом 50: " + countWithdraw50);
            System.out.println("Выдано купюр номиналом 20: " + countWithdraw20);
            System.out.println("Выдано купюр номиналом 10: " + countWithdraw10);
            return true;
        } else {
            return false;
        }
    }

    private boolean isMultipleOfTen(int amount) {
        return amount % 10 != 0;
    }

    public int getBalance() {
        return count50 * 50 + count20 * 20 + count10 * 10;
    }
}
