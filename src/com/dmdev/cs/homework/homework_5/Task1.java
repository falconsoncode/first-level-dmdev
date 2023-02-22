package com.dmdev.cs.homework.homework_5;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class Task1 {
    public static void main(String[] args) {

        String value = "abc Cpddd Dio OsfWw";

        removeDuplicates(value);

    }

    private static void removeDuplicates(String value) {
        StringBuilder result = new StringBuilder();

        String tempString = value.replace(" ", "").toUpperCase();
        char previousChar = '\0';
        for (char c : tempString.toCharArray()) {
            if(c != previousChar) {
                result.append(c);
                previousChar = c;
            }
        }
        System.out.println(result.toString());
    }
}
