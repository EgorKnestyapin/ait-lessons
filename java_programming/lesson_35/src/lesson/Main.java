package lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    /*
    Collections

    List and ArrayList - список, в основе своей имеющий массив и количество элементов в листе не фиксировано.

    Конструкторы ArrayList:
    ArrayList() - создает пустой лист
    ArrayList(Collection collection) - создается лист, в который добавляются все элементы коллекции collection
    ArrayList(int capacity) - список с начальным размером capacity
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();

        // добавление элемента в конец, метод add()
        names.add("John");
        names.add("Bob");
        System.out.println(names);

        // добавление элемента по индексу
        names.add(1, "Bill");
        System.out.println(names);
        System.out.println(names.size());

        // изменить элемент - метод set()
        names.set(1, "Mary");
        System.out.println(names);
        System.out.println(names.get(0)); // получение элемента по индексу - метод get()
        System.out.println(names.get(names.size() - 1));

        // удаление элемента - метод boolean remove(Object o)
        // names.remove("Mary");
        System.out.println(names);
        // удаление по индексу - Object remove(int index) удаление по индексу

        // int indexOf(Object o) - возвращает индекс элемента
        int position = names.indexOf("Mary");
        System.out.println(position);

        // boolean contains(Object o) - проверяет, содержит ли лист данный элемент
        System.out.println(names.contains("Jack"));
        System.out.println(names.contains("John"));

        // сортировка коллекций
        Collections.sort(names);
        System.out.println(names);

        System.out.println("For Loop");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("Enhanced For");
        for (String name : names) {
            System.out.println(name);
        }

        // Итератор
        /*
        iterator() - один из методов интерфейса Collection. Он возвращает объект, реализующий интерфейс Iterator
        E next() - возвращает следующий элемент коллекции
        boolean hasNext() - проверяет, не достигнут ли конец коллекции
        remove() - удаляет текущий элемент (полученный последним вызовом next())
         */
        System.out.println("With iterator");
        Iterator<String> ourIterator = names.iterator();
        while (ourIterator.hasNext()) {
            if (ourIterator.next().equals("Mary"))
                ourIterator.remove();
        }
        System.out.println(names);
     }
}
