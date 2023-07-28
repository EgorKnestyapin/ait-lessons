package homework;

public class DifferenceMaxMinEl {
    public static void main(String[] args) {
        // Есть массив целых чисел. Написать программу, находящую разницу между значением максимального
        // и минимального элементов. (max - min).
        int[] nums = {3,24,75,56,-45,21,6};
        int maxEl = nums[0];
        int minEl = nums[0];
        int difference = 0;

        for (int i = 1; i < nums.length; i++) { // счет можно начать с 1, так как нулевой индекс уже использовался
            if (nums[i] > maxEl) {
                maxEl = nums[i];
            }
            if (nums[i] < minEl) {
                minEl = nums[i];
            }
        }
        difference = maxEl - minEl;
        System.out.println("Difference between max element " + maxEl + " and min element " + minEl + " in array is " +
                            difference);
    }
}
