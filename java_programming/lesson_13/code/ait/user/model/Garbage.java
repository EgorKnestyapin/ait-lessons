package ait.user.model;

import java.util.Scanner;

public class Garbage {
    public static void main(String[] args) {
        // Задание 3. Написать метод, который получает на вход вид выбрасываемого мусора (слово),
        // а возвращает цвет урны, в которую его надо выбросить. Протестировать метод, вызвав его в методе main.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a type of garbage:");
        String garbage = scanner.nextLine();
        System.out.println(sortGarbage(garbage));
    }

    public static String sortGarbage(String garbage) {
        switch (garbage.toLowerCase()) {
            case "paper":
                return "Blue";
            case "bio":
                return "Brown";
            default:
                return "Black";
        }
    }
}
