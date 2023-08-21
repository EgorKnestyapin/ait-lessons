package ait.user.model;

import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        /* Задача 1. Реализуйте метод, который вычисляет длину гипотенузы прямоугольного треугольника по двум
        заданным пользователем катетам (теорема Пифагора).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a first cathetus:");
        double a = scanner.nextDouble();
        System.out.println("Input a second cathetus:");
        double b = scanner.nextDouble();
        printHypotenuse(a, b);
    }
    static void printHypotenuse(double a, double b) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
        System.out.printf("Hypotenuse is %.2f", c);
    }
}
