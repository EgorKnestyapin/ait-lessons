package homework;

public class FindIndex {
    public static void main(String[] args) {
        /* Написать метод, принимающий массив целых чисел и число и находящий индекс этого числа(элемента) в массиве.
        Если такой элемент есть, возвращается его индекс, если нет, метод возвращает -1.
        В методе main() вывести получившийся результат на экран
         */
        int[] ints = {4, 5, 6, 2, 7};
        int num = 4;
        System.out.println(findIndex(ints, num));
    }

    static int findIndex(int[] ints, int num) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
