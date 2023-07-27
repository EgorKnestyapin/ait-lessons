package lesson;

public class MinElAndIndex {
    public static void main(String[] args) {
        // Задача 2. Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
        // Найдите минимальный элемент массива и его индекс.
        int[] numArr = {75, 34, -15, -123, 57, -145, 86, 77, 48, -59};
        int i = 0;
        int minNum = numArr[0];
        int index = 0;
        while (i < numArr.length) {
            if (numArr[i] < minNum) {
                minNum = numArr[i];
                index = i;
            }
            i++;
        }
        System.out.println("Min element of array is " + minNum + " and his index is " + index);
    }
}
