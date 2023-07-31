package homework;

public class FactorialTriangle {
    public static void main(String[] args) {
        // Оформить решение задачи 1 про факториал и задачи 4 про треугольник из предыдущего домашнего задания
        // в виде методов
        printFactorial(5);
        printTriangle(6);
    }

    static void printFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of number " + num + " is " + factorial);
    }

    static void printTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
