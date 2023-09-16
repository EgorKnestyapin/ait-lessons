package lesson;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    }

    /* Дано два списка User. Реализовать метод List<User> findDuplicates(Collection<User> collA,Collection<User> collB),
    который вернет лист дубликатов
     */
    public static List<String> findDuplicates(Collection<String> collA, Collection<String> collB) {
        Set<String> set1 = new HashSet<>(collA);
        Set<String> set2 = new HashSet<>(collB);
        set1.retainAll(set2);
        return new ArrayList<>(set1);
    }

    /* Дан список строк List<String>. Получить список 4 самых часто встречаемых слов
    1. Список строк-текстов преобразовать в список слов
    2. Сформировать Map<String,Integer>
    3. Отсортировать сет из Entry
     */
}
