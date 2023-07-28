package homework;

public class Factorial {
    public static void main(String[] args) {
        /* Написать программу, вычисляющую факториал числа 5.
        Факториал числа - это произведение всех целых чисел от 1 до самого числа.
        Т.е. факториал 5 это: 5! = 5 * 4 * 3 * 2 * 1. ! -обозначение факториала.
         */
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of number " + n + " is " + factorial);
    }
}
