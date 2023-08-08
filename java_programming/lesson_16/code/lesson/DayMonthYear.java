package lesson;

public class DayMonthYear {
    public static void main(String[] args) {
        // Написать метод,, который принимает 3 числа int (day, month, year) возвращает строку вида "08. August 2023"
        System.out.println(getStringDayMonthYear(8, 8, 2023));
    }

    static String getStringDayMonthYear(int day, int month, int year) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        String dayString = day > 10 ? "" + day : "0" + day;
        return dayString + ". " + months[month - 1] + " " + year;
    }
}
