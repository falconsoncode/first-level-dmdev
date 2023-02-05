package com.dmdev.cs.homework.homework_1;

/**
 * Даны 3 переменные:
 * <p>
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * <p>
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * <p>
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */
public class Task2 {
    public static void main(String[] args) {
        double operand1 = 10.0;
        double operand2 = 5.5;
        char plus = '+';
        char subtraction = '-';
        char multiplication = '*';
        char division = '/';
        char mod = '%';
        char invalid = '$';

        System.out.println("plus operation " + calculate(operand1, operand2, plus));
        System.out.println("subtraction operation " + calculate(operand1, operand2, subtraction));
        System.out.println("multiplication operation " + calculate(operand1, operand2, multiplication));
        System.out.println("division operation " + calculate(operand1, operand2, division));
        System.out.println("mod operation " + calculate(operand1, operand2, mod));
        System.out.println("invalid operation " + calculate(operand1, operand2, invalid));

    }

    public static double calculate(double operand1, double operand2, char operation) {
        switch (operation) {
            case '+' -> {
                return operand1 + operand2;
            }
            case '-' -> {
                return operand1 - operand2;
            }
            case '*' -> {
                return operand1 * operand2;
            }
            case '/' -> {
                return operand1 / operand2;
            }
            case '%' -> {
                return operand1 % operand2;
            }
            default -> {
                System.out.println("Invalid Operation");
                return 0;
            }
        }
    }

}
