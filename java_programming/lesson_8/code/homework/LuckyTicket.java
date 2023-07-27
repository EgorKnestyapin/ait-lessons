package homework;

public class LuckyTicket {
    public static void main(String[] args) {
        //  Задано 6ти значное число, которое является номером автобусного билета.
        //  Проверьте, является ли этот билет счастливым.

        int num = 322223;
        int[] numArr = new int[6];
        int i = 0;
        while (num > 0) {
            numArr[i] = num % 10;
            num = num / 10;
            i++;
        }
        if (numArr[0] + numArr[1] + numArr[2] == numArr[3] + numArr[4] + numArr[5]) {
            System.out.println("Wow!! Lucky ticket!");
        } else {
            System.out.println("Oops... Unlucky");
        }
    }
}
