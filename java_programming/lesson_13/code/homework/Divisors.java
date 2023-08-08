package homework;

public class Divisors {
    public static void main(String[] args) {
        // Реализовать метод, выводящий на экран все делители введенного пользователем целого числа.
        // Вернуть массив со всеми делителями числа.
        int[] divisorsArr = getDivisors(6);
        for (int num : divisorsArr) {
            System.out.println(num);
        }
    }

    public static int[] getDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum++;
            }
        }
        int[] divisorsArr = new int[sum];
        for (int i = 1, j = 0; i <= num; i++) {
            if (num % i == 0) {
                divisorsArr[j] = i;
                j++;
            }
        }
        return divisorsArr;
    }
}
