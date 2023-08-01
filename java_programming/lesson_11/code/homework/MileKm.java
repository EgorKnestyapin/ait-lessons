package homework;

import java.util.Scanner;

public class MileKm {
    public static void main(String[] args) {
        // Реализуйте с помощью метода конвертор, который переводит скорость в милях в час в скорость в км/час.
        // 1 миля равна 1609 метров. Метод получает на вход данные от пользователя с клавиатуры.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input mile per hour:");
        double milePerHour = scanner.nextDouble();
        convertMileToKm(milePerHour);
    }

    public static void convertMileToKm(double milePerHour) {
        double kmPerHour = milePerHour / 1.609;
        System.out.printf("Kilometer per hour is %.2f", kmPerHour);
    }
}
