package com.dmdev.cs.homework.homework_2;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * <p>
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class Task3 {
    public static void main(String[] args) {
        double salary = 600.0;
        double expenses = 300.0;
        int time = 38;

        calculateAccountValues(salary, expenses, time);
    }

    public static void calculateAccountValues(double salary, double expenses, int time) {
        double investment = 0.0;
        double broker = 0.0;
        double account = 0.0;

        for (int i = 0; i < time; i++) {
            if (i > 0 && i % 6 == 0) {
                salary += 400.0;
            }
            if (i > 0) {
                investment = salary * 0.1;
            }
            broker += investment * 0.02;
            account = salary - expenses - investment;
        }
        System.out.println("Salary: " + salary);
        System.out.println("Broker: " + broker);
        System.out.println("Account: " + account);
    }
}
