package homework;

public class HeightArray {
    public static void main(String[] args) {
        /* Собрать в массив данные о росте (или возрасте) членов группы.
        Выведите на печать максимальное и минимальное значение.
         */
        double[] heightArr = {1.63, 1.76, 1.82, 1.74, 1.86, 1.67, 1.78};
        double maxHeight = heightArr[0];
        double minHeight = heightArr[0];
        int i = 1;

        while (i < heightArr.length) {
            if (heightArr[i] > maxHeight) {
                maxHeight = heightArr[i];
            } else if (heightArr[i] < minHeight) {
                minHeight = heightArr[i];
            }
            i++;
        }
        System.out.println("Minimal height is " + minHeight);
        System.out.println("Maximal height is " + maxHeight);
    }
}
