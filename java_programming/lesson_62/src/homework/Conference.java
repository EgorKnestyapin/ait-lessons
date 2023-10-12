package homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Conference implements Comparable<Conference> {
    private String theme;
    private LocalDateTime dateTime;
    private String link;

    public Conference(String theme, String date, String time, String link) {
        this.theme = theme;
        this.dateTime = parseStringToLocalDateTime(date, time);
        this.link = link;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    private LocalDateTime parseStringToLocalDateTime(String date, String time) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH-mm");
        LocalDate localDate = LocalDate.parse(date, dateFormatter);
        LocalTime localTime = LocalTime.parse(time, timeFormatter);
        return LocalDateTime.of(localDate, localTime);
    }

    @Override
    public String toString() {
        return "\nConference:\n" +
                "theme: " + '\'' + theme + '\'' +
                ", dateTime: " + dateTime +
                ", link: " + '\'' + link + '\'';
    }

    @Override
    public int compareTo(Conference o) {
        return this.dateTime.compareTo(o.dateTime);
    }
}
