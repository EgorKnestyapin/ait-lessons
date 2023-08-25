package homework;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        /* Задайте массив на 10 элементов и заполните его случайными числами в интервале от -10 до 10.
        Распечатайте полученный массив. Создайте метод, который определяет наличие дубликатов в массиве.
        Разработайте соответсвующий тест (набор тестов).
         */
        int[] array = new int[10];
        int a = -10;
        int b = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        System.out.println(Arrays.toString(array));
    }

    public static boolean findDuplicates(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
