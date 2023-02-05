package com.dmdev.cs.homework.homework_1;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * <p>
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class Task3 {
    public static void main(String[] args) {
        double triangle1 = getTriangleArea(5, 5);
        double triangle2 = getTriangleArea(4, 4);

        //первый больше второго
        compareTriangleArea(triangle1, triangle2);
        //второй больше первого
        compareTriangleArea(triangle2, triangle1);
        //равны
        compareTriangleArea(triangle1, triangle1);
    }

    public static double getTriangleArea(int firstSide, int secondSide) {
        return (double) (firstSide * secondSide) / 2;
    }

    public static void compareTriangleArea(double area1, double area2) {
        if (area1 > area2) {
            System.out.println("Первый треугольник больше второго треугольника");
        } else if (area1 < area2) {
            System.out.println("Первый треугольник меньше второго треугольника");
        } else {
            System.out.println("Треугольники равны");
        }

    }
}
