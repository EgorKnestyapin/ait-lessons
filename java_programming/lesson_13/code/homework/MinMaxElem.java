package homework;

public class MinMaxElem {
    public static void main(String[] args) {
        // Написать метод, возвращающий минимальный и максимальный элемент из поданного ему на вход массива целых чисел.
        int[] ints = {1, 5, 7, 9, 3, -1, -5, 4};
        int[] minMaxArr = getMinMaxElem(ints);
        System.out.println("Min element of array is " + minMaxArr[0] + " and max element of array is " + minMaxArr[1]);
    }

    public static int[] getMinMaxElem(int[] numArr) {
        int min = numArr[0];
        int max = numArr[0];
        int[] minMaxArr = new int[2];
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
            } else if (numArr[i] < min) {
                min = numArr[i];
            }
        }
        minMaxArr[0] = min;
        minMaxArr[1] = max;
        return minMaxArr;
    }
}
