package ait.user.model;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /* Задача 3. Calculator:
        добавить ввод чисел и математического действия пользователем;
        реализовать все вычисления методами, которые получают данные для вычислений на вход.
         */
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input an action:");
            String action = scanner.next();
            System.out.println("Input a first number:");
            double num1 = scanner.nextDouble();
            System.out.println("Input a second number:");
            double num2 = scanner.nextDouble();
            switch (action) {
                case "+":
                    sum(num1, num2);
                    break;
                case "-":
                    subtraction(num1, num2);
                    break;
                case "*":
                    multiply(num1, num2);
                    break;
                case "/":
                    division(num1, num2);
                    break;
                case "q":
                    return;
                default:
                    System.out.println("No action");
            }
        }
    }

    static void sum(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    static void subtraction(double num1, double num2) {
        System.out.println(num1 - num2);
    }

    static void multiply(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    static void division(double num1, double num2) {
        System.out.println(num1 / num2);
    }
}
