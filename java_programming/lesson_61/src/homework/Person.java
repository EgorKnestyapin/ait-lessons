package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person> {
    private String name;
    private Date birthDate;

    public Person(String name, String yearOfBirth) throws ParseException {
        this.name = name;
        this.birthDate = convertStringToDate(yearOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    private Date convertStringToDate(String yearOfBirth) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date date = formatter.parse(yearOfBirth);
        return date;
    }

    @Override
    public int compareTo(Person o) {
        return o.birthDate.compareTo(this.birthDate);
    }
}
