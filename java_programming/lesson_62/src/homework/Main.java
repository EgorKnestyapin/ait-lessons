package homework;


import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Задача 1. Создайте класс Conference с полями:
        - тема String
        - время LocalDateTime
        - ссылка на приглашение String
        В конструкторе конференции нужно принимать отдельно две строки (date - "dd-MM-yyyy", time - "HH-mm")
        Создайте лист конференций и отсортируйте их по возрастанию
         */
        System.out.println("============ Task 1 =============");
        List<Conference> conferences = List.of(
                new Conference("Lecture", "09-10-2023", "11-30", "us104-12412-12"),
                new Conference("Consultation", "05-09-2023", "15-30", "us25-123512-12"),
                new Conference("Practice", "15-11-2022", "16-00", "us104-12412-12")
        );
        List<Conference> sortedConferenceList = conferences.stream().sorted().toList();
        System.out.println(sortedConferenceList);

        System.out.println("============ Task 2 =============");
        String periodStringFormat = getPeriodStringFormat(
                LocalDate.of(2023, 10, 12),
                LocalDate.of(2025, 3, 17));
        System.out.println(periodStringFormat);
    }
    /* Создайте метод, который принимает две даты LocalDate, а возвращает строку, сколько времени между ними пройдет.
    Например: "10 years, 2 months, 3 days"
    Используйте класс Period
     */
    public static String getPeriodStringFormat(LocalDate localDate1, LocalDate localDate2) {
        Period period = Period.between(localDate1, localDate2);
        return period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days";
    }
}
