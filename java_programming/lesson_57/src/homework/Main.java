package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    /* В программе задан список Person{ String fName, String lName, String email, String phone, Address address}.
    Класс адрес в Person это:  Address{String postcode, String city, String street, String house}
    Реализовать следующие функции:
   	-получить список всех ФИО
    -получить список всех e-mail
   	-получить список всех телефонов
   	-получить список всех адресов в виде строки адреса

   	Добавить в ваш метод возможность отфильтровать список, т.е. возможность получить список не всех ФИО, а только
   	список ФИО содержащих заданную строку, или начинающихся на заданную. букву
     */
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Ivan", "Polyakov", "ivan@gmail.com", "+3241512",
                        new Address("124524", "Moscow", "Bolotnaya", "24-1")),
                new Person("Jack", "London", "jack@gmail.com", "+512412",
                        new Address("42151", "London", "Compton", "+24125412")));
        List<String> list1 = personHandler(list, person -> person.getfName() + " " + person.getlName(), person -> person.getfName().contains("ack"));
        List<String> list2 = personHandler(list, person -> person.getEmail(), null);
        List<String> list3 = personHandler(list, person -> person.getPhone(), person -> person.getPhone().startsWith("+324"));
        List<String> list4 = personHandler(list, person -> person.getAddress().toString(), null);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
    }

    public static <T, R> List<R> personHandler(List<T> list, Function<T, R> function, Predicate<T> predicate) {
        List<R> res = new ArrayList<>();
        for (T el : list) {
            if (predicate == null || predicate.test(el)) {
                res.add(function.apply(el));
            }
        }
        return res;
    }
}
