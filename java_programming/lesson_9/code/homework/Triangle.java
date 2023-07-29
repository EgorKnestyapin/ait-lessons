package homework;

public class Triangle {
    public static void main(String[] args) {
        /* Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
        1
        12
        123
        1234
        12345
        123456
         */
//        String triangle = "";
//        int a = 1;
//        int b = 6;
//        for (int i = a; i <= b; i++) {
//            triangle += i;
//            System.out.println(triangle);
//        }
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
