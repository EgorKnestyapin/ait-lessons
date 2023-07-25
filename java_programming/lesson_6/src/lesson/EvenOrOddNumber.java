package lesson;

public class EvenOrOddNumber {
    public static void main(String[] args) {
         /* Задание 1. Имеется целое число n, задайте его самостоятельно в программе.
        Выясните, является ли это число четным?
        Является ли это число кратным 3? Кратным 5? Кратным 10?
         */
        int n = 4;
        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        if (n % 3 == 0) {
            System.out.println("Кратное 3");
        } else if (n % 5 == 0) {
            System.out.println("Кратное 5");
        } else if (n % 10 == 0) {
            System.out.println("Кратное 10");
        } else {
            System.out.println("Не кратное 3, 5, 10");
        }
    }
}
