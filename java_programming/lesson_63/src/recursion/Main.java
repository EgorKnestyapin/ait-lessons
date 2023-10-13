package recursion;

public class Main {
    public static void main(String[] args) {
        recursivePrint(3);
    }

    // печатает числа от указанного числа до нуля
    public static void recursivePrint(int number) {
        if (number == 0) { // базовый случай - условие выхода
            System.out.println(0);
            return;
        }
        System.out.println(number);
        recursivePrint(number - 1); // number - 1 - шаг рекурсии
    }

    public static void recursivePrintVer2(int number) {
        if (number > 0) {
            System.out.println(number);
            recursivePrint(number - 1);
        } else {
            System.out.println(0);
        }
    }
}
