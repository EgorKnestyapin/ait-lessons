package homework;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 3, -1, 0, 4, 8, 2, 5};
        Arrays.doSelectionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
