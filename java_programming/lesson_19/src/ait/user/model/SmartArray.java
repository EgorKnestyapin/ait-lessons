package ait.user.model;

import java.util.Scanner;

public class SmartArray {
    private int[] arr = new int[4];
    private int size = 0;

    public void add(int element) {
        if (size >= arr.length) {
            increaseArray();
        }
        arr[size] = element;
        size++;
    }

    public void increaseArray() {
        int[] tempArray = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }

    public int[] getArray() {
        int[] tempArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        return tempArray;
    }

    public String toString() {
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += " " + arr[i];
        }
        return res + "]";
    }

    public String inputOutputNumbers() {
        System.out.println("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num != 0) {
            add(num);
            System.out.println("Input a number: ");
            num = scanner.nextInt();
        }
        return "You have input the following numbers: " + arr + "\nTotal " + size + " numbers" + "\nAverage value: " +
                calculateAverageValue(arr);
    }

    public double calculateAverageValue(int[] ints) {
        double sum = 0;
        for (int num : ints) {
            sum += num;
        }
        return sum / ints.length;
    }
}
