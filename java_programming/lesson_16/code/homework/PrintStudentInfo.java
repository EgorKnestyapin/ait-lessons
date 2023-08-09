package homework;

import lesson.DayMonthYear;
import lesson.MyDate;

public class PrintStudentInfo {
    public static void main(String[] args) {
        /* #1 Создать класс Student со следующими полями (String firstName, String lastName, MyDate birthday,
        String group, MyDate startCourse}
        Создайте пару объектов этого класса. Напишите метод studentToString(Student student),
        который возвращает строку с данными студента.
         */
        Student student1 = new Student();
        student1.firstName = "Gleb";
        student1.lastName = "Ivanov";
        student1.group = "Cohort31-1";
        MyDate dateBirthday1 = new MyDate();
        dateBirthday1.day = 1;
        dateBirthday1.month = 2;
        dateBirthday1.year = 1999;
        student1.birthday = dateBirthday1;
        MyDate dateStartCourse1 = new MyDate();
        dateStartCourse1.day = 18;
        dateStartCourse1.month = 7;
        dateStartCourse1.year = 2023;
        student1.startCourse = dateStartCourse1;

        Student student2 = new Student();
        student2.firstName = "Stas";
        student2.lastName = "Smirnov";
        student2.group = "Cohort29";
        MyDate dateBirthday2 = new MyDate();
        dateBirthday2.day = 6;
        dateBirthday2.month = 8;
        dateBirthday2.year = 1984;
        student2.birthday = dateBirthday2;
        MyDate dateStartCourse2 = new MyDate();
        dateStartCourse2.day = 5;
        dateStartCourse2.month = 9;
        dateStartCourse2.year = 2022;
        student2.startCourse = dateStartCourse2;

        System.out.println(studentToString(student1));
        System.out.println(studentToString(student2));
    }
    public static String studentToString(Student student) {
        return student.firstName + " " + student.lastName + " " + student.group + "\nBirthday: " +
                DayMonthYear.getStringDayMonthYear(student.birthday) +  "\nThe beginning of the course: " +
                DayMonthYear.getStringDayMonthYear(student.startCourse);
    }
}
