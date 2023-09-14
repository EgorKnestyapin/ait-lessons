package homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");
        System.out.println(createNewKeyWithSumValue(map1));

        Student victor = new Student("Victor");
        Student jack = new Student("Jack");
        Student john = new Student("John");
        Student peter = new Student("Peter");
        List<Student> students = new ArrayList<>(Arrays.asList(victor, jack, john, jack, victor, peter, jack, victor));
        System.out.println(getStudentsVisitCount(students));
    }

    /*
    ** Задача 1 **
    Дана Map<String, String>, если в ней есть ключ "a" и "b", то нужно создать новый ключ ‘ab’ с суммой значений от 
    ключей a и b. 
    Примеры: mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b":"There"} mapAB({"a": "Hi"}) → 
    {"a": "Hi"} mapAB({"b": "There"}) → {"b": "There"}
     */
    public static void mapAB(Map<String, String> map, String key1, String key2) {
        if (map != null && map.containsKey(key1) && map.containsKey(key2)) {
            map.put(key1 + key2, map.get(key1) + map.get(key2));
        }
    }

    public static Map<String, String> createNewKeyWithSumValue(Map<String, String> map) {
        Set<Map.Entry<String, String>> entries = map.entrySet();
        String keySum = "";
        String valueSum = "";
        for (Map.Entry<String, String> entry : entries) {
            keySum += entry.getKey();
            valueSum += entry.getValue();
        }
        map.put(keySum, valueSum);
        return map;
    }

    /*
    ** Задача 2 **
    Дан список студентов. Каждая запись в этом списке означает, что студен посетил занятие. Необходимо сформировать
    Map<Student, Integer>, где ключ студент, а значение - количество занятий.
    */
    public static Map<Student, Integer> getStudentsVisitCount(List<Student> students) {
        Map<Student, Integer> map = new HashMap<>();
        for (Student student : students) {
            map.putIfAbsent(student, 0);
            map.put(student, map.get(student) + 1);
        }
        return map;
    }
}

