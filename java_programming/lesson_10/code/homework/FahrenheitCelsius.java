package homework;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        // Написать метод для перевода градусов по фаренгейту в шкалу цельсия. Формула для расчета С = 5*(F-32)/9.
        // Результат вывести на экран.
        switchFromFahrenheitToCelsius(67.5); // 19,7
    }
    static void switchFromFahrenheitToCelsius(double F) {
        double C = 5 * (F - 32) / 9;
        System.out.printf("%.1f", C);
    }
}
