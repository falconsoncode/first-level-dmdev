package com.dmdev.cs.homework.homework_2;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * <p>
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class Task2 {
    public static void main(String[] args) {
        int number = 4508;
        System.out.println(revertNumber(number));
    }

    private static int revertNumber(int number) {
        int reverted = 0;
        int temp;
        while (number > 0) {
            temp = number % 10;
            reverted = (reverted * 10) + temp;
            number = number / 10;
        }
        return reverted;
    }
}
