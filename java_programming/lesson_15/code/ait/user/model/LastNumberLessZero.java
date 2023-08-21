package ait.user.model;

public class LastNumberLessZero {
    public static void main(String[] args) {
        int[] ints = {4, -2, 5, -4};
        System.out.println(findLastNumberLessZero(ints));
    }

    // Написать метод, который получает массив целых чисел, и возвращает последнее число в массиве, которое меньше 0
    static int findLastNumberLessZero(int[] ints) {
        int num = 0;
        for (int i = ints.length - 1; i >= 0; i--) {
            if (ints[i] < 0) {
                return  ints[i];
            }
        }
        return num;
    }
}
