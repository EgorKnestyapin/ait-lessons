package lesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(readInt());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int readInt() {
        int value = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int:");
        try {
            value = scanner.nextInt();
        } catch (Exception e) {
            throw new ReadIntException();
        }
        return value;
    }

    public static int readInt2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int:");
        int value = scanner.nextInt();
        return value;
    }
}
