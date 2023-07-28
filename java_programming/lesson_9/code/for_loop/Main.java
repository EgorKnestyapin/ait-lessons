package for_loop;

public class Main {
    public static void main(String[] args) {
        /* Цикл for.
         for (initialization; condition; increment/decrement) {
             statement(s);
         }
         */
        for ( int i = 0,  j = 10; i <= j; i++, j--) {
            System.out.println(i + " " + j);
        }

        int sum = 0, n = 10;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

        // без тела цикла
        sum = 0;
        for (int i = 0; i <= n; sum += i++);
        System.out.println("sum with no body: " + sum);
    }
}
