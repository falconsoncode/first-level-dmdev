package com.dmdev.cs.homework.homework_1;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * <p>
 * Протестировать функцию в main.
 */
public class Task1 {

    public static void main(String[] args) {

        //correct input
        System.out.println(quarterHourIdentification(0));
        System.out.println(quarterHourIdentification(1));
        System.out.println(quarterHourIdentification(16));
        System.out.println(quarterHourIdentification(31));
        System.out.println(quarterHourIdentification(45));

        //invalid input
        System.out.println(quarterHourIdentification(60));
        System.out.println(quarterHourIdentification(-1));
    }

    public static String quarterHourIdentification(int minutes) {
        if (isValidMinutes(minutes)) {
            int quarter = minutes / 15;
            return switch (quarter) {
                case 0 -> "The entered number: " + minutes + " is First quarter";
                case 1 -> "The entered number: " + minutes + " is Second quarter";
                case 2 -> "The entered number: " + minutes + " is Third quarter";
                case 3 -> "The entered number: " + minutes + " is Fourth quarter";
                default -> "Invalid input";
            };
        } else {
            return "The entered number: " + minutes + " is Invalid input";
        }
    }

    public static boolean isValidMinutes(int minutes) {
        return minutes >= 0 && minutes <= 59;
    }

}