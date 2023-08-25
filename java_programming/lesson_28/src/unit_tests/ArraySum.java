package unit_tests;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        /* Задайте массив на 10 элементов и заполните его случайными числами в интервале от -10 до 10.
        Распечатайте полученный массив. Найдите сумму элементов массива c нечетными индексами.
        Разработайте соответсвующий тест (набор тестов)
         */
        int[] array = new int[10];
        int a = -10;
        int b = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sumElOddIndex(array));
    }

    public static int sumElOddIndex(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                sum += array[i];
            }
        }
        return sum;
    }
}
