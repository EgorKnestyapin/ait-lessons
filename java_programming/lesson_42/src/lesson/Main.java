package lesson;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student victor = new Student("Victor", 4);
        Student jack = new Student("Jack", 5);
        Student john = new Student("John", 4);
        Student michael = new Student("Michael", 6);
        List<Student> students = new ArrayList<>(Arrays.asList(victor, jack, john, michael));
        System.out.println(listHandler(students));
    }

    /*
    Дан список студентов Student{String name, int lessons}.
    Необходимо сформировать Map<Integer, List<Student>>, где ключ - кол-во уроков, а значение  - список студентов
    */
    public static Map<Integer, List<Student>> listHandler(List<Student> students) {
        Map<Integer, List<Student>> res = new HashMap<>();
        if (students == null) return res;
        for (Student student : students) {
            res.putIfAbsent(student.getLessons(), new ArrayList<>());
            res.get(student.getLessons()).add(student);
            /* Альтернатива
            List<Student> list = res.getOrDefault(student.getLessons(), new ArrayList<>());
            list.add(student);
            res.put(student.getLessons(), list);
             */
        }
        return res;
    }
}
