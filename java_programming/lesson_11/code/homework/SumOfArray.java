package homework;

public class SumOfArray {
    public static void main(String[] args) {
        // Реализуйте метод sumOfArray (сумма элементов массива), который получает на вход массив и определяет
        // сумму его элементов.
        int[] numArray = {4, 5, 3, 7, 8, 1};
        sumOfArray(numArray);
    }
    public static void sumOfArray(int[] numArray) {
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }
        System.out.println("Sum of array is " + sum);
    }
}
