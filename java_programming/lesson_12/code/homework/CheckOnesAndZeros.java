package homework;

public class CheckOnesAndZeros {
    public static void main(String[] args) {
        /* Написать метод, проверяющий содержатся ли в массиве целых чисел 0 или -1. Если да, метод возвращает true,
        если нет false.
        static boolean checkOnesAndZeros( int[] ints)
        В методе main() вывести получившийся результат на экран
         */
        int[] ints = {1, 4, 6, 7, -1};
        System.out.println(checkOnesAndZeros(ints));
    }

    static boolean checkOnesAndZeros(int[] ints) {
        for (int num : ints) {
            if (num == 0 || num == -1)
                return true;
        }
        return false;
    }
}
