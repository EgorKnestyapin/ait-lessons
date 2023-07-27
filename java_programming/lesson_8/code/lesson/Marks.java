package lesson;

public class Marks {
    public static void main(String[] args) {
        // Задача 1. Имеются оценки абитуриента из его аттестата, всего 12 оценок. Найдите средний балл абитуриента.
        int[] marksArr = {3,4,5,1,4,5,1,4,5,5,1,5}; // - это прямое заполнения массива в коде

        int length = marksArr.length;
        System.out.println("Length of marks array is " + length);

        int i = 0;
        int sum = 0;
        while (i < length) {
            sum = sum + marksArr[i];
            i++;
        }
        double averageNum = (double) sum / length;
        System.out.printf("Average num is %.2f", averageNum);
    }
}
