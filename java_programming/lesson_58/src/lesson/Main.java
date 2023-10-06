package lesson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> listPerson = List.of(
                new Person("Ivan", "Polyakov", "ivan@gmail.com", "+3241512",
                        new Address("124524", "Moscow", "Bolotnaya", "24-1")),
                new Person("fName1", "lName1", "ivan@gmail.com", "+3241512",
                        new Address("124524", "Moscow", "Bolotnaya", "24-1")),
                new Person("fName2", "lName2", "ivan2@gmail.com", "+2222",
                        new Address("124524", "Moscow", "Bolotnaya", "25-1")),
                new Person("Jack", "London", "jack@gmail.com", "+512412",
                        new Address("42151", "London", "Compton", "+24125412")));
//        List<Integer> list;
//        list = List.of(8, 2, 7, 4);
//        list.stream()
//                .map(i -> String.valueOf(i))
//                .forEach(s -> System.out.println(s));
//        List<String> list1 = list.stream()
//                .filter(i -> i % 2 == 0)
//                .map(i -> Integer.toBinaryString(i))
//                .toList();
//        list1.forEach(s -> System.out.println(s));
        List<String> list = listPerson.stream()
                .map(p -> p.getfName() + " " + p.getlName())
                .toList();
        list.forEach(s -> System.out.println(s));
        HashSet<String> collect = listPerson.stream()
                .map(p -> p.getEmail())
                .collect(Collectors.toCollection(() -> new HashSet<>()));
        collect.forEach(s -> System.out.println(s));
    }
}
