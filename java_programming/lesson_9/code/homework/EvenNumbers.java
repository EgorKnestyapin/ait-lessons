package homework;

public class EvenNumbers {
    public static void main(String[] args) {
        // Есть массив из 10 целых чисел. Написать программу, находящую количество четных чисел в нем.
        int amount = 0;
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                amount++;
            }
        }
        System.out.println("Amount of even numbers in the array is " + amount);
    }
}
