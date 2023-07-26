package while_loop;

public class Main {
    public static void main(String[] args) {

        // while (condition) {
        //   statement;
        //   statement;
        // }

        // распечатать латинский алфавит из маленьких букв
        char ch = 'a';

        // while (ch <= 'z') {
        //    System.out.println(ch);
        //    ch++;
        // }

        // Вложенные циклы. Таблица умножения
        int i = 1;
        while (i <= 9) {
            int j = 1;
            while (j <= 9) {
                System.out.println(i + " * " + j + " = " + i * j);
                j++;
            }
            System.out.println("*************");
            i++;
        }
    }
}
