package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "To be or not to be that is the question " +
                "Whether tis nobler in the mind to suffer " +
                "The slings and arrows of outrageous fortune " +
                "Or to take arms against a sea of troubles " +
                "And by opposing end them To die to sleep " +
                "No more";
        System.out.println(getFirstLetterStrings(text));
        System.out.println(getFirstLetterStrings2(text));
    }

    /*
    ** Задача 1 **
    Дана String с произвольным текстом (без знаков препинания слова разделены пробелом). Необходимо получить map,
    де ключем будет выступать первая буква слова, а значением, список слов начинающихся на эту букву
    */
    public static Map<Character, List<String>> getFirstLetterStrings(String text) {
        Map<Character, List<String>> res = new HashMap<>();
        for (String str : text.toLowerCase().split(" ")) {
            char key = str.charAt(0);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(str);
        }
        return res;
    }

    public static Map<Character, List<String>> getFirstLetterStrings2(String text) {
        Map<Character, List<String>> res = new HashMap<>();
        for (String str : text.toLowerCase().split(" ")) {
            char key = str.charAt(0);
            List<String> list = res.getOrDefault(key, new ArrayList<>());
            list.add(str);
            res.put(key, list);
        }
        return res;
    }
}
