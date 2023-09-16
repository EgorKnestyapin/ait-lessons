package homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String text1 = "To be or not to be that is the question " +
                "Whether tis nobler in the mind to suffer " +
                "The slings and arrows of outrageous fortune " +
                "Or to take arms against a sea of troubles " +
                "And by opposing end them To die to sleep " +
                "No more";
        String text2 = "and by a sleep to say we end " +
                "The heart-ache and the thousand natural shocks " +
                "That flesh is heir to tis a consummation " +
                "Devoutly to be wish To die to sleep";
        String text3 = "To sleep perchance to dream there is the rub " +
                "For in that sleep of death what dreams may come " +
                "When we have shuffled off this mortal coil " +
                "Must give us pause there is the respect " +
                "That makes calamity of so long life";
        list.add(text1);
        list.add(text2);
        list.add(text3);
        System.out.println(getMostFrequentlyRepeatedWords(list, 4));

        List<String> names1 = Arrays.asList("John", "Jack", "Anna");
        List<String> names2 = Arrays.asList("Chris", "Nick");
        List<String> names3 = Arrays.asList("Tim");
        List<String> names4 = Arrays.asList("Jane", "Peter", "Michael");
        Map<Integer, List<String>> map = new HashMap<>();
        map.put(24, names1);
        map.put(45, names2);
        map.put(52, names3);
        map.put(31, names4);
        System.out.println(getListPersons(map));
    }

    /*
    ** Задача 1 **
    Дан List, каждая строка которого содержит текст (слова разделены пробелом, без знаков препинания).
    Необходимо получиить N самых часто встречающихся слов
     */
    public static List<String> stringToListWords(String text) {
        if (text == null) return Collections.emptyList(); // возвращает пустой лист
        return Arrays.asList(text.toLowerCase().split(" "));
    }

    public static List<String> convertListTextToListString(List<String> list) {
        if (list == null) return Collections.emptyList();
        List<String> res = new ArrayList<>();
        for (String text : list) {
            for (String word : stringToListWords(text)) {
                res.add(word);
            }
        }
        return res;
    }


    public static List<String> getMostFrequentlyRepeatedWords(List<String> list, int numFrequentWords) {
        Map<String, Integer> res = getStringIntegerMap(convertListTextToListString(list));
        if (res == null) return Collections.emptyList();
        Set<Map.Entry<String, Integer>> entrySet = new HashSet<>(res.entrySet());
        List<String> frequentWords = new ArrayList<>();
        for (int i = 0; i < numFrequentWords; i++) {
            int maxNumberRepetitions = 0;
            String word = "";
            for (Map.Entry<String, Integer> entry : entrySet) {
                if (entry.getValue() > maxNumberRepetitions && !frequentWords.contains(entry.getKey())) {
                    maxNumberRepetitions = entry.getValue();
                    word = entry.getKey();
                }
            }
            if (maxNumberRepetitions != 0) {
                frequentWords.add(word);
            }
        }
        return frequentWords;
    }

    private static Map<String, Integer> getStringIntegerMap(List<String> list) {
        if (list == null) return Collections.emptyMap();
        Map<String, Integer> res = new HashMap<>();
        for (String word : list) {
            res.put(word, res.getOrDefault(word, 0) + 1);
        }
        return res;
    }

    /*
    ** Задача 2 **
    Дан Map<Integer, List> - ключ возраст, значение список имен людей этого возраста.
    Необходимо получить список объектов Person{String name, int age}
    */
    public static List<Person> getListPersons(Map<Integer, List<String>> map) {
        List<Person> res = new ArrayList<>();
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            int age = entry.getKey();
            for (String name : entry.getValue()) {
                res.add(new Person(name, age));
            }
        }
        return res;
    }
}
