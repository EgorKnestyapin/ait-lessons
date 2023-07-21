public class Main {
    public static void main(String[] args) {
        // Написать программу, вычисляющую и выводящую на печать ASCII значение символа 'B'
        char ch = 'B';
        System.out.println("ch value is " + ch); // ch value is B

        /* Даны две строки а и в. Написать программу, соединяющую их и выводящую на экран в виде abba,
        Например "Hi" и "Bye" должны быть напечатаны как HiByeByeHi
         */
        String a = "Hi";
        String b = "Bye";
        System.out.println(a + b + b + a); // HiByeByeHi

        /* Написать программу, выводящую на экран символ строки с индексом 2.
        Например, если строка Java, то результат будет 'v'
         */
        String java = "Java";
        System.out.println(java.charAt(2)); // v

        /* Написать программу, выводящую на экран целое число, равное двойной длине строки.
        Т.е. если есть строка Java, то ответ будет 8
         */
        String hello = "Hello";
        System.out.println(hello.length() * 2); // 10
    }
}