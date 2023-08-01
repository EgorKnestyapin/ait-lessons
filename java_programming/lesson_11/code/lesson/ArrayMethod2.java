package lesson;

import java.util.Random;
import java.util.Scanner;

public class ArrayMethod2 {
    public static void main(String[] args) {
        /* Задача 5. реализуйте метод, который получает на вход массив, искомое число и отвечает на вопрос,
        нашлось ли это число в массиве.
         */
        int[] arr = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-10, 10);
        }
        findNumber(arr, num);
    }

    static void findNumber(int[] arr, int num) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Bingo");
        } else {
            System.out.println("Unlucky...");
        }
    }
}
