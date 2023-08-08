package lesson;

public class DateComparison {
    // Написать метод, который принимает 6 целых чисел (day1, month1, year1, day2, month2, year2) и возвращает 1,
    // если первая дата раньше второй, 0 если они равны, -1 если вторая дата раньше второй.
    public static void main(String[] args) {
        MyDate myDate = new MyDate(); // create new object of MyDate class
        myDate.day = 1;
        myDate.month = 3;
        myDate.year = 2023;
        System.out.println(compareDates(1, 3, 2023, 1, 2, 2023));
    }

    static int compareDates(int day1, int month1, int year1, int day2, int month2, int year2) {
        if (year2 > year1) {
            return 1;
        } else if (year1 > year2) {
            return -1;
        } else {
            if (month2 > month1) {
                return 1;
            } else if (month1 > month2) {
                return -1;
            } else {
                if (day2 > day1) {
                    return 1;
                } else if (day1 > day2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    static int compareDates2(int day1, int month1, int year1, int day2, int month2, int year2) {
        int date1 = year1 * 10000 + month1 * 100 + day1;
        int date2 = year2 * 10000 + month2 * 100 + day2;
        if (date1 == date2) {
            return 0;
        }
        return date1 < date2 ? 1 : -1;
    }
}
