package for_loop;

import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        /* Задача 3. Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
        Запросите у пользователя какое-то натуральное число. Определите, есть ли это число в массиве.
        Создайте и используйте метод searchInArray, который получает на вход массив и искомое число,
        а возвращает ответ - нашлось ли это число в массиве.
         */
        int[] randomArr = new int[10]; // объявили массив

        int a = 1;
        int b = 100;
        int i = 0;
        while (i < randomArr.length) {
            randomArr[i] = (int) (Math.random()*(b - a + 1) + a);
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");
        int num = scanner.nextInt();
        searchInArray(randomArr, num);

    }
    static void searchInArray(int[] array, int num) {
        int length = array.length;
        int i = 0;
        boolean flag = false;
        while (i < length) {
            System.out.println(array[i]);
            if (num == array[i]) {
                System.out.println("Bingo: " + num);
                flag = true;
                break;
            }
            i++;
        }
        if (!flag) System.out.println("Sorry.....");
    }
}
