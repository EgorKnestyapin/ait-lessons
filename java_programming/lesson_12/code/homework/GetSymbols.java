package homework;

import java.util.Scanner;

public class GetSymbols {
    public static void main(String[] args) {
        /* Написать метод, принимающий строку и возвращающий второй и третий символы строки заглавными буквами.
        Пример : Hello-> EL
        В методе main() вывести получившийся результат на экран
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string:");
        String str = scanner.nextLine();
        System.out.println(getSymbols(str));
    }

    static String getSymbols(String str) {
        return str.substring(1, 3).toUpperCase();
    }
}
