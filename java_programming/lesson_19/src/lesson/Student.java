package lesson;

import java.util.Arrays;

public class Student {
    private String name;
    private SmartArray array;

    public Student(String name) {
        this.name = name;
        this.array = new SmartArray();
    }

    public String toString() {
        return name + " " + array;
    }

    public void addRate(int rate) {
        array.add(rate);
    }
}
