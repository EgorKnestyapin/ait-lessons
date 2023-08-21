package ait.user.model;

public class DayMonthYear {
    public static void main(String[] args) {
        // Написать метод,, который принимает 3 числа int (day, month, year) возвращает строку вида "08. August 2023"
        MyDate date1 = new MyDate(); // create new object of MyDate class
        date1.day = 1;
        date1.month = 3;
        date1.year = 2023;
        System.out.println(getStringDayMonthYear(date1));
    }

    public static String getStringDayMonthYear(MyDate myDate) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        String dayString = myDate.day >= 10 ? "" + myDate.day : "0" + myDate.day;
        return dayString + ". " + months[myDate.month - 1] + " " + myDate.year;
    }
}
