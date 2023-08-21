package ait.user.model;

import java.util.Random;

public class ArrayMethod {
    public static void main(String[] args) {
        // Задача 4. реализуйте метод, который получает на вход массив и находит его минимальный элемент.
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        findMinElem(arr);
    }

    static void findMinElem(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min element of array is " + min);
    }
}
