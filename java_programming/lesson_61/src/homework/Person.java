package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person> {
    private String name;
    private Date yearOfBirth;

    public Person(String name, String yearOfBirth) throws ParseException {
        this.name = name;
        this.yearOfBirth = convertStringToDate(yearOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Date yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    private Date convertStringToDate(String yearOfBirth) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date date = formatter.parse(yearOfBirth);
        return date;
    }

    @Override
    public int compareTo(Person o) {
        return Long.compare(this.yearOfBirth.getTime(), o.yearOfBirth.getTime());
    }
}
