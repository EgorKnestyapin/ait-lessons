package homework;

public class MaxElem {
    public static void main(String[] args) {
        /* Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
        Найдите максимальный элемент массива и его индекс.
         */
        int[] numArr = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int maxElem = numArr[0];
        int i = 1;
        int index = 0;

        while (i < numArr.length) {
            if (numArr[i] > maxElem) {
                maxElem = numArr[i];
                index = i;
            }
            i++;
        }
        System.out.println("Max element of array is " + maxElem + " and his index is " + index);
    }
}
