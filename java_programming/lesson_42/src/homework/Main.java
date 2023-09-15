package homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "To be or not to be that is the question " +
                "Whether tis nobler in the mind to suffer " +
                "The slings and arrows of outrageous fortune " +
                "Or to take arms against a sea of troubles " +
                "And by opposing end them To die to sleep " +
                "No more";
        System.out.println(getFirstLetterStrings(stringToListWords(text)));
        System.out.println(getFirstLetterStrings2(stringToSetWords(text)));
    }

    /*
    ** Задача 1 **
    Дана String с произвольным текстом (без знаков препинания слова разделены пробелом). Необходимо получить map,
    де ключем будет выступать первая буква слова, а значением, список слов начинающихся на эту букву
    */
    public static Map<Character, List<String>> getFirstLetterStrings(Collection<String> collection) {
        Map<Character, List<String>> res = new HashMap<>();
        for (String str : collection) {
            char key = str.charAt(0);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(str);
        }
        return res;
    }

    public static Map<Character, List<String>> getFirstLetterStrings2(Collection<String> collection) {
        Map<Character, List<String>> res = new HashMap<>();
        for (String str : collection) {
            char key = str.charAt(0);
            List<String> list = res.getOrDefault(key, new ArrayList<>());
            list.add(str);
            res.put(key, list);
        }
        return res;
    }

    public static List<String> stringToListWords(String text) {
        if (text == null) return Collections.emptyList(); // возвращает пустой лист
        return Arrays.asList(text.toLowerCase().split(" "));
    }

    public static Set<String> stringToSetWords(String text) {
        if (text == null) return Collections.emptySet();
        return new HashSet<>(List.of(text.toLowerCase().split(" ")));
    }
}
