package our_map;

import java.util.*;

public class Main {
    /*
    Интерфейс Map
    4 класса:
    HashTable
    HashMap
    LinkedHashMap
    TreeMap

    мапа представляет собой набор пар ключ-значение
    В качестве ключей могут быть разные типы данных.
    Ключи в мапе уникальны. Значения могут повторяться
     */
    public static void main(String[] args) {
        Map<Integer, String> ourMap = new HashMap<>();
        ourMap.put(1200, "Notebook"); // добавить элемент
        ourMap.put(10, "Mouse");
        ourMap.put(1100, "Comp");
        ourMap.remove(10); // удалить элемент по ключу
        System.out.println(ourMap);
        System.out.println(ourMap.get(1200)); // получить элемент по ключу
        System.out.println(ourMap.size()); // размер
        System.out.println(ourMap.containsKey(1200)); // содержит ли мапа ключ
        System.out.println(ourMap.containsValue("Notebook")); // содержит ли мапа значение
        System.out.println(ourMap.keySet()); // получить набор ключей
    }
}
