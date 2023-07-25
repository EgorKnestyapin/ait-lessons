package homework;

public class MaxNumber {
    public static void main(String[] args) {
        /* Задача 1. Написать программу, выводящую на экран максимальное из трех целых чисел.
        Числа задайте самостоятельно внутри программы.
        Решите эту задачу с помощью if ... else и также с помощью тернарного оператора.
         */
        int x = 1;
        int y = 10;
        int a = (int)(Math.random() * (y - x + 1) + x);
        System.out.println("a = " + a);
        int b = (int)(Math.random() * (y - x + 1) + x);
        System.out.println("b = " + b);
        int c = (int)(Math.random() * (y - x + 1) + x);
        System.out.println("c = " + c);

        // 1 способ
        if (a >= b && a >= c) {
            System.out.println("Число a " + a + " максимальное");
        } else if (b >= a && b >= c) {
            System.out.println("Число b " + b + " максимальное");
        } else {
            System.out.println("Число c " + c + " максимальное");
        }

        // 2 способ
        int maxNumber = (a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c;
        System.out.println("Число " + maxNumber + " максимальное");
    }
}