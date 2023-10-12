package localdate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Java 8 - new API to work with date and time
        // LocalDate - год, месяц, день
        // LocalTime - как на часах
        // LocalDateTime - все вместе: год, месяц, день + конкретное время
        // 1. How to create an instance?
        // of(), now()
        LocalDate today = LocalDate.now(); // 2023-10-12
        System.out.println(today);
        // вобьем вручную
        LocalDate tomorrow = LocalDate.of(2023, 10, 13);

        LocalTime moment = LocalTime.now(); // 12:53:20.090260500
        System.out.println(moment);
        LocalTime endOfLesson = LocalTime.of(13, 0, 0);

        LocalDateTime thisPointInTime = LocalDateTime.now();
        System.out.println(thisPointInTime);
        LocalDateTime endOfTomorrowLesson =
                LocalDateTime.of(2023, 10, 13, 13, 0, 0);
        LocalDateTime endOfTomorrowLesson2 = LocalDateTime.of(tomorrow, endOfLesson);
        System.out.println(endOfTomorrowLesson2);

        // 2. Immutability - неизменяемость / немутабельность
        // LocalDate и остальные - немутабельные
        // Для изменения времени есть методы plus...minus
        LocalDate dayOfNextWeek = today.plusDays(7);
        LocalDate dayOfLastWeek = today.minusDays(7);
        // .plusDays() .plusMonths() .plusYears()
        // .minusDays() .minusMonths() .minusYears()
        LocalTime afterEndOfLesson = endOfLesson.plusHours(2).plusMinutes(30);

        // 3. Getting fields values
        int numberOfDayToday = today.getDayOfMonth();
        System.out.println(numberOfDayToday);
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println(dayOfWeek);
        DayOfWeek.MONDAY.getDisplayName(TextStyle.FULL, Locale.CANADA);
        // также можно получать LocalTime
        int currentHour = moment.getHour();
        System.out.println(currentHour);

        // 4. Period
        LocalDate unity = LocalDate.of(1990, 10, 3);
        // We can calculate period between those dates
        Period period = Period.between(unity, today);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        Period vacation = Period.of(0, 0, 14);
        System.out.println(vacation);

        // Assume that my vacation starts 2024.02.12
        // And vacation is 14 days
        // We
        LocalDate startOfVacation = LocalDate.of(2024, 2, 12);
        LocalDate endOfVacation = startOfVacation.plus(vacation);
        System.out.println(endOfVacation);

        // 5. How to parse string? And to format?
        // Если строка приходит через дефис - 2022-12-12
        // parse
        LocalDate christmas = LocalDate.parse("2023-12-25");
        System.out.println(christmas);
        // if format is different we can use DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate orthodoxChristmas = LocalDate.parse("2023/12/25", formatter);

        // Format
        String unitySlashStyle = formatter.format(unity);
        System.out.println(unitySlashStyle);
    }
}
