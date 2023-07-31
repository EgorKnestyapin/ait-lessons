package homework;

import java.util.Scanner;

public class NameAge {
    public static void main(String[] args) {
        /* Написать программу, которая принимает с клавиатуры имя, фамилию и возраст (Ваши или воображаемого персонажа)
        и выводит в консоль эту информацию в следующем виде:
        First name: John
        Last name: Smith
        Age: 25
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name:");
        String name = scanner.nextLine();
        System.out.println("Input your surname:");
        String surname = scanner.nextLine();
        System.out.println("Input your age:");
        int age = scanner.nextInt();
        System.out.println("First name: " + name + "\nLast name: " + surname + "\nAge: " + age);
    }
}
