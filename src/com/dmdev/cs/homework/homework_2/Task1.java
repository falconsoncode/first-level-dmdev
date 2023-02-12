package com.dmdev.cs.homework.homework_2;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class Task1 {
    public static void main(String[] args) {
        int number = 228910;
        System.out.println("количество четных:");
        System.out.println(countEven(number));
        System.out.println("количество нечетных:");
        System.out.println(countOdd(number));
    }

    private static int countEven(int number) {
        int count = 0;
        while (number > 0) {
            if(number % 2 != 0) {
                count++;
            }
            number = number/10;
        }
        return count;
    }

    private static int countOdd(int number) {
        int count = 0;
        while (number > 0) {
            if(number % 2 == 0) {
                count++;
            }
            number = number/10;
        }
        return count;
    }

}
