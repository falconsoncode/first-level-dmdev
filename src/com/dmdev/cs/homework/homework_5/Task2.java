package com.dmdev.cs.homework.homework_5;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * <p>
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Task2 {
    public static void main(String[] args) {

        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";

        int[] digits = getDigits(value);
        int sum = getSum(digits);

        System.out.println(sum);
    }

    private static int[] getDigits(String value) {
        StringBuilder temp = new StringBuilder();
        for (char c : value.toCharArray()) {
            if (c >= '0' && c <= '9') {
                temp.append(c);
            }
        }

        int[] result = new int[temp.length()];
        for (int i = 0; i < result.length; i++) {
            int digit = temp.charAt(i) - '0';
            result[i] = digit;
        }
        return result;
    }

    private static int getSum(int[] digits) {
        int result = 0;
        for (int x : digits) {
            result += x;
        }
        return result;
    }
}
