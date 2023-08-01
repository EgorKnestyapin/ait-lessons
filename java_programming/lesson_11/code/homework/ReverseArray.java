package homework;

public class ReverseArray {
    public static void main(String[] args) {
        // Написать метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
        // Сначала последний элемент, потом предпоследний, и т. д.
        int[] numArray = {4, 5, 3, 7, 8, 1};
        printReverseArray(numArray);
    }

    public static void printReverseArray(int[] numArray) {
        for (int i = numArray.length - 1; i >= 0; i--) {
            System.out.println(numArray[i]);
        }
    }
}
