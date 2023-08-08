package homework;

import java.util.Date;

// #2 Придусайте и опишите любой свой класс. Создайте объект этого класса
public class Employee {
    String name;
    String surname;
    String email;
    String phoneNumber;
    String address;
    int age;
    Date startOfWork;
    Date endOfWork;
    boolean isDismissed;

    void canWork() {
        System.out.println("This employee knows how to work");
    }
}
