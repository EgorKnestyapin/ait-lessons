package linked_list;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    // Linked methods методы отличающиеся от ArrayList
    /*
    addFirst() / offerFirst() - добавляет элемент в начало листа
    addLast() / offerLast() - добавляет последний элемент
    removeFirst() / pollFirst() - удаляет первый элемент
    removeLast() / pollLast() - удаляет последний элемент
    getFirst() / peekFirst() - получить первый
    getLast() / peekLast() - получить последний
     */
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>(Arrays.asList("John", "Jack", "Bill"));
        System.out.println(names);
        names.addFirst("Ann");
        System.out.println(names);
        names.add(0, "Mary");
        System.out.println(names);
    }
}
