package homework;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        printNumFromOneToN(6);
        System.out.println(isPalindrome("око", 3));
        System.out.println(getViolinistNameOfOldestViolin(
                new Violin("Jack", LocalDate.of(2011, 12, 13)),
                new Violin("John", LocalDate.of(2015, 11, 2)),
                new Violin("Nick", LocalDate.of(2006, 8, 5))
        ));
    }

    /* Задание 1 рекурсия
    Дано натуральное число n. Выведите все числа от 1 до n.
    Иными словами, метод должен принимать натуральное число и выводить числа от 1 до это числа.
    Например, для параметра 6 -> выведет 1 2 3 4 5 6
    */
    public static void printNumFromOneToN(int n) {
        if (n < 1) return;
        if (n == 1) {
            System.out.println(n);
        } else {
            printNumFromOneToN(n - 1);
            System.out.println(n);
        }
    }

    /* Задание 2 рекурсия (супер опциональное)
    Дано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово палиндромом.
    Выведите yes, если является и no - если не является.
    P.S. Палиндром - это слово, которое одинаково читается слева направо, например: око, потоп.
     */
    public static String isPalindrome(String word, int counter) {
        if (counter > word.length()) throw new RuntimeException("Counter must match the word length");
        if (counter == word.length() / 2 + 1) {
            return "yes";
        }
        if (word.charAt(counter - 1) != word.charAt(word.length() - counter)) {
            return "no";
        }
        return isPalindrome(word, counter - 1);
    }

    public static String isPalindrome2(String word) {
        if (word.isEmpty() || word.length() == 1) {
            return "yes";
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            isPalindrome2(word.substring(1, word.length() - 1));
        } else {
            return "no";
        }
    }

    /* Задание 3 Varargs
    Создайте класс скрипка. Пусть у скрипки будут поля:
    String имя мастера, LocalDate дата производства Создайте в Майне метод, который должен принимать произвольное
    число скрипок и возвращать имя мастера самой старой скрипки из переданных.
    То есть метод должен бытия статическим и возвращать String.
     */
    public static String getViolinistNameOfOldestViolin(Violin... args) {
        Optional<String> violinistName = Arrays.stream(args)
                .sorted()
                .map(Violin::getViolinistName)
                .findFirst();
        return violinistName.orElse(null);
    }
}
