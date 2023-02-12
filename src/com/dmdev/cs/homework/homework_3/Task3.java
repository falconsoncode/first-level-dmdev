package com.dmdev.cs.homework.homework_3;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * <p>
 *                             [-4, -18]
 * <p>
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * <p>
 *                             [1, 9, 3]
 */

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {-4, 0, 1, 9, 0, -18, 3};
        System.out.println(Arrays.toString(splitArray(arr)));
    }

    public static int[][] splitArray(int[] array) {
        int negCount = 0;
        int posCount = 0;
        int zeroCount = 0;

        for (int num : array) {
            if (num < 0) {
                negCount++;
            } else if (num > 0) {
                posCount++;
            } else {
                zeroCount++;
            }
        }

        int[] negativeNumbers = new int[negCount];
        int[] positiveNumbers = new int[posCount];
        int[] zeroNumbers = new int[zeroCount];

        int negIndex = 0;
        int posIndex = 0;
        int zeroIndex = 0;

        for (int num : array) {
            if (num < 0) {
                negativeNumbers[negIndex++] = num;
            } else if (num > 0) {
                positiveNumbers[posIndex++] = num;
            } else {
                zeroNumbers[zeroIndex++] = num;
            }
        }

        return new int[][] {negativeNumbers, positiveNumbers, zeroNumbers};
    }
}
