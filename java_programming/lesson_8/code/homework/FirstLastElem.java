package homework;

public class FirstLastElem {
    public static void main(String[] args) {
        /* Создайте массив из 20 случайных целых чисел в интервале от 10 до 20. Выведите массив на печать.
        Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.
         */
        int[] numArr = new int[20];
        int i = 0;
        int a = 10;
        int b = 20;
        int lengthArr = numArr.length;

        while (i < lengthArr) {
            numArr[i] = (int) (Math.random()*(b - a + 1) + a);
            System.out.print(numArr[i] + " ");
            i++;
        }
        System.out.println();

        int firstElem = numArr[0];
        numArr[0] = numArr[lengthArr-1];
        numArr[lengthArr-1] = firstElem;

        i = 0;
        while (i < lengthArr) {
            System.out.print(numArr[i] + " ");
            i++;
        }
    }
}
