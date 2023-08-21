package ait.user.model;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//        Singleton singleton3 = Singleton.getInstance();
//        singleton1.temp = 1;
//        singleton2.temp = 2;
//        System.out.println(singleton1.temp);
//        System.out.println(singleton2.temp);
        Student[] students = {
                new Student("Jack"),
                new Student("John"),
                new Student("Ivan"),
        };
        students[0].ask();
        students[0].ask();
        students[0].ask();
        students[1].ask();
        Arrays.binarySearch(students, 1);
    }
}
