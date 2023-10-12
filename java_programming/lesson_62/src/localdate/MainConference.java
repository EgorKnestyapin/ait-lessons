package localdate;

import java.util.List;

public class MainConference {
    public static void main(String[] args) {
        /* Создайте класс Conference с полями:
        - тема String
        - время LocalDateTime
        - ссылка на приглашение String
        В конструкторе конференции нужно принимать отдельно две строки (date - "dd-MM-yyyy", time - "HH-mm")
        Создайте лист конференций и отсортируйте их по возрастанию
         */
        List<Conference> conferences = List.of(
                new Conference("Lecture", "09-10-2023", "11-30", "us104-12412-12"),
                new Conference("Consultation", "05-09-2023", "15-30", "us25-123512-12"),
                new Conference("Practice", "15-11-2022", "16-00", "us104-12412-12")
        );
        List<Conference> sortedConferenceList = conferences.stream().sorted().toList();
        System.out.println(sortedConferenceList);
    }
}
