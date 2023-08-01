package homework;

import java.util.Random;

public class Denomination {
    public static void main(String[] args) {
        /* Имеется массив данных - остатки на счетах клиентов банка (задать случайными числами в интервале от 10 000
        до 100 000000 д.е., количество клиентских счетов = 20). Произошла деноминация, теперь 1 д.е = 100 старых д.е.
        Рассчитайте новые остатки денег на счетах клиентов.
         */
        Random random = new Random();
        int[] clientBills = new int[20];
        for (int i = 0; i < clientBills.length; i++) {
            clientBills[i] = random.nextInt(10000, 100000000);
        }
        convertToNewSystem(clientBills);
    }

    public static void convertToNewSystem(int[] clientBills) {
        double[] newClientBills = new double[20];
        System.out.println("Converting bills to the new system:");
        for (int i = 0; i < clientBills.length; i++) {
            newClientBills[i] = (double) clientBills[i] / 100;
            System.out.printf("%.2f д.е.\n", newClientBills[i]);
        }
    }
}
