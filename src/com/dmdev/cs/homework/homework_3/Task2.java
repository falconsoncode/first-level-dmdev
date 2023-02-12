package com.dmdev.cs.homework.homework_3;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */

public class Task2 {
    public static void main(String[] args) {
        char[] charArr = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};

        processCharArray(charArr);
    }

    private static void processCharArray(char[] charArray) {
        int[] intArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = charArray[i];
        }

        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }

        int average = sum / intArray.length;
        System.out.println("Average: " + average);

        System.out.println("Elements greater than average:");
        for (int num : intArray) {
            if (num > average) {
                System.out.println(num);
            }
        }
    }
}
