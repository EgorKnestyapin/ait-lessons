package ait.user.model;

public class MoneyOnAccount {
    public static void main(String[] args) {
        // Задание 1. Реализуйте метод, который получает на вход сумму вклада, процентную ставку и количество дней,
        // а возвращает накопленный доход.
        // Формула для расчета: https://www.raiffeisen.ru/wiki/kak-rasschitat-procenty-po-vkladu/
        double sum = 350_000;
        double percent = 4.7;
        int days = 273;
        System.out.println(gainIncome(sum, percent, days));
    }
    public static double gainIncome(double sum, double percent, int days) {
        double result = (sum * percent * days ) / (100 * 365);
        return result;
    }
}
