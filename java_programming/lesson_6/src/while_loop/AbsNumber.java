package while_loop;

public class AbsNumber {
    public static void main(String[] args) {
        /* Задание 6. Определите модуль целого числа с помощью тернарного оператора.
        Целое число задайте случайным образом в интервале от -10 до 10.
         */
        int a = -10;
        int b = 10;
        int n = (int)(Math.random() * (b - a + 1) + a);
        System.out.println(n);

        int absN = n > 0 ? n : n * -1;
        System.out.println("Absolute value of " + n + " is " + absN);
    }
}
