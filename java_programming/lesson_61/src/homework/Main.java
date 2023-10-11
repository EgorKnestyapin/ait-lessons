package homework;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    /* Создайте класс Person, c полями имя(стринг) и дата рождения(Date), которому при создании передавайте имя и
    дату рождения в виде строки в формате "ДД.ММ.ГГГГ".
    Реализуйте в классе интерфейс Comparable<Person>, в котором "меньше" будет значить "младше".
     */
    public static void main(String[] args) throws ParseException {
        Person jack = new Person("Jack", "01.12.1997");
        Person nick = new Person("Nick", "23.10.2001");
        Person john = new Person("John", "18.05.1989");
        List<Person> personList = List.of(jack, nick, john);
        List<Person> sortedPersonList = personList.stream()
                .sorted()
                .toList();
        System.out.println(sortedPersonList);
    }
}
