package homework;

public class LeapYear {
    public static void main(String[] args) {
        /* Задача 4(*). Написать программу, определяющую является ли год високосным (значение года задается
        в программе). Для того чтобы быть високосным, год должен: делится без остатка на 4 и либо не должен делится
        без остатка на 100, либо, если он делится на 100, то он должен делится также на 400.
         */
        int a = 1;
        int b = 2023;
        String leapYear = "not a leap year";
        int year = (int)(Math.random() * (b - a + 1) + a);
        System.out.println("Year = " + year);
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = "a leap year";
                }
            }
        }
        System.out.println("The year " + year + " is " + leapYear);
    }
}
