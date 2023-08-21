package ait.user.model;

public class Person {
    String firstName;
    String lastName;
    String phone;
    MyDate birthday;

    public String toString() {
        return firstName + " " + lastName + " (" + birthday.toString() + ")" + "\nphone: " + phone;
    }
}
