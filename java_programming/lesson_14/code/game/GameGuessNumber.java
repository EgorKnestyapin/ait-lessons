package game;

import java.util.Scanner;

public class GameGuessNumber {
    /* Написать игру "Угадай число", в которой за ограниченное число попыток ввода числа с клавиатуры нужно
    угадать секретное число от 0 до 9.

    Условия:
    1. Код игры находится в классе GameGuessNumber.
    2. Класс должен содержать:
        - сканер для ввода числа
        - secret, в котором записано секретное число
        - следующие методы:
            - метод, считывающий количество предоставляемых попыток
            - метод, который считывает вводимое число
            - метод, содержащий логику игры
            - метод последовательности вывода предыдущих методом
     */
    static Scanner scanner = new Scanner(System.in);
    static int secret = 9;

    public static void start() {
        int attempts = readNumberOfAttempts();
        guessNumber(attempts);
    }

    static int readNumberOfAttempts() {
        System.out.println("Input a number of attempts:");
        return scanner.nextInt();
    }

    static int readNumber() {
        System.out.println("Input a number from 0 to 9");
        return scanner.nextInt();
    }

    static void guessNumber(int attempts) {
        while (attempts > 0) {
            int num = readNumber();
            attempts--;
            if (num == secret) {
                System.out.println("Bingo! You have guessed ");
                return;
            } else {
                System.out.println("Wrong. You have " + attempts + " attempts left.");
            }
        }
        System.out.println("Sorry, buddy. Maybe some other time");
    }
}
