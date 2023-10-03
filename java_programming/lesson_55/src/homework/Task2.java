package homework;

import java.util.Arrays;

public class Task2 {
    /* Задача 2 Дан массив строк. Каждую строку из этого массива нужно преобразовать в массив байт
    (см. метод getBytes у строки). Получить двумерный массив byte[][] такой, где каждая строка -
    это массив байта, полученный преобразованием соответствуюшей String из данного массива строк.
     */
    public static void main(String[] args) {
        String[] arr = {"hello", "wonderful", "world", "!"};
        byte[][] arr1 = covertToByteArr(arr);
        System.out.println(Arrays.deepToString(arr1));
    }

    public static byte[][] covertToByteArr(String[] arr) {
        byte[][] res = new byte[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i].getBytes();
        }
        return res;
    }
}
