package com.dmdev.cs.homework.homework_3;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 */
public class Task1 {

    public static void main(String[] args) {

        int[] arr = {3, 5, -6, 3, 2, -9, 0, -123};

        System.out.println("Result: " + Arrays.toString(removeNegativesAndMultiply(arr)));
    }

    private static int[] removeNegativesAndMultiply(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                result[index++] = array[i] * count;
            }
        }

        return result;
    }
}
