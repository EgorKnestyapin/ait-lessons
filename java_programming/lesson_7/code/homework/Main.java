package homework;

public class Main {
    public static void main(String[] args) {
        /* Задача1
        С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа k
        Пример:для числа k=3
        1 в кубе 1
        2 в кубе 8
        3 в кубе 27
         */
        int num = 1;
        int k = 3;

        while (num <= k) {
            System.out.println(num + " в кубе " + num * num * num);
            num++;
        }

        /*
        Задача2
        С помощью цикла while написать программу, выводящую на экран результат умножения данного цисла n на все целые числа от 0 до n
        Пример: для числа 3 результат будет 0, 3, 6, 9
         */
        int num1 = 0;
        int n = 3;

        while (num1 <= n) {
            System.out.println("Число " + num1 + ", умноженное на " + n + ", равно " + num1 * n);
            num1++;
        }
    }
}
