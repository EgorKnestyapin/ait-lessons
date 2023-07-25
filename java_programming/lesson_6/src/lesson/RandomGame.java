package lesson;

public class RandomGame {
    public static void main(String[] args) {
        /* Задание 4. Задайте в программе число myGuess в интервале от 1 до 5. Затем для переменной n вызовите датчик
        случайных в интервале от 1 до 5. int n = (int)(Math.random() * (b - a + 1) + a) - генерирует
        случайное целое число в интервале [a, b] a может быть и b тоже может быть.
        Проверьте, угадали ли вы число, которое выдал датчик случайных числе.
         */
        int myGuess = 4;
        int a = 1;
        int b = 5;

        int n = (int)(Math.random() * (b - a + 1) + a);
        if (myGuess == n) {
            System.out.println("Угадали число: " + n);
        } else {
            System.out.println("Не угадали число");
        }
    }
}
