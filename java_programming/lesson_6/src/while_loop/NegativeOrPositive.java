package while_loop;

public class NegativeOrPositive {
    public static void main(String[] args) {
        /* Задание 2. Имеются два целых числа n и m, задайте их самостоятельно в программе.
        Выясните, является ли хотя бы одно из них отрицательным?
         */
        int n = 1;
        int m = -2;
        if (n < 0) {
            System.out.println("Число k отрцательное: " + n);
        } else if (m < 0) {
            System.out.println("Число m отрицательное: " + m);
        } else {
            System.out.println("Числа k: " + n + " и m: " + m + " не являются отрицательными");
        }
    }
}
