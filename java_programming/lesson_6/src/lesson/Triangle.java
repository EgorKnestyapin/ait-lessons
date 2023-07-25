package lesson;

public class Triangle {
    public static void main(String[] args) {
        /* Задание 3. Даны 3 целых числа 10, 3 и 2 - длины отрезков.
        Проверьте, можно ли из них составить треугольник или нельзя?
        Неравенство треугольника - каждая сторона треугольника меньше суммы двух других сторон.
         */
        int a = 10;
        int b = 3;
        int c = 2;
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Можно составить треугольник");
        } else {
            System.out.println("Нельзя составить треугольник");
        }
    }
}
