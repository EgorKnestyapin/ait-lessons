package homework;

import java.util.Arrays;

public class Task1 {
    /* Задача 1
    Создать двумерный массив 5x3 т.е. 5 строк 3 столбца. Заполнить его случайными числами.
     */
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 8}, {2, 7, 3}, {6, 2, 5}, {9, 4, 2}, {5, 7, 1}};
        int[] arr1 = convertToOneDimensionalArr(arr);
        System.out.println(Arrays.toString(arr1));
        changeFirstThirdArr(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    /*     Написать метод, который преобразует его в одномерный массив из 15 элементов, перенося числа по-порядку
    (слева направо и сверху вниз) из исходного
     */
    public static int[] convertToOneDimensionalArr(int[][] arr) {
        int[] res = new int[arr.length * arr[0].length];
        for (int i = 0, counter = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res[counter] = arr[i][j];
                counter++;
            }
        }
        return res;
    }
    /* Написать метод, который меняет все значения из первой строки, на соответствующие значения из 3 строки,
    а значения из третьей строки на значения из первой. Т.е. в итоге нужно поменять местами первую и третью строки
    исходного массива.
     */
    public static void changeFirstThirdArr(int[][] arr) {
        int[] temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
    }
}
