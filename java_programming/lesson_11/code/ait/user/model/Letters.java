package ait.user.model;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        // Задача 2. Реализуйте метод, который получает на вход строку на английском языке и сообщает количество
        // гласных букв в ней.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string:");
        String str = scanner.nextLine().toLowerCase();
        printAmountVowels(str);
    }
    static void printAmountVowels(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'y'};
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (str.charAt(i) == vowels[j]) {
                    counter++;
                    break;
                }
            }
        }
        System.out.println("Amount of vowels in string are " + counter);
    }
}
