package lesson;

public class DateComparison {
    // Написать метод, который принимает 6 целых чисел (day1, month1, year1, day2, month2, year2) и возвращает 1,
    // если первая дата раньше второй, 0 если они равны, -1 если вторая дата раньше второй.
    public static void main(String[] args) {
        System.out.println(compareDates(1,3,2023,1,2,2023));
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
}
