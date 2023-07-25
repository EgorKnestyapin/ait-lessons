public class Main {

    public static void main(String[] args) {
        /* Есть строка четной длины. Написать программу, выводящую на экран первую половину этой строки.
        Пример: есть Hell , результат He
         */
        String hell = "Hell";
        System.out.println(hell.substring(0, hell.length() / 2)); // He

        /* Есть две переменные целого типа. Написать программу, выводящую на экран true если значение
        одной из переменных = 10 или сумма значение переменных равна 10.
        Иначе на экран выводится false.
         */
        int a = 10;
        int b = 9;

        boolean result = a == 10 || b == 10 || a + b == 10;
        System.out.println(result);
    }
}