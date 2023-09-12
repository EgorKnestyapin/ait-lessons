package homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    }

    /* Написать метод, который принимает лист имен, в котором имена могут повторяться, и возвращает лист без
    повторяющихся элементов. Использовать множества в решении.
    */
    public static List<String> removeDuplicates(List<String> input) {
        Set<String> set = new HashSet<>(input);
        return new ArrayList<>(set);
    }

    /* Написать метод, который принимает лист имен, в котором имена могут повторяться, и возвращает лист повторяющихся
    элементов.
     */
    public static List<String> getDuplicates(List<String> input) {
        Set<String> set = new HashSet<>();
        List<String> duplicates = new ArrayList<>();
        for (String str : input) {
            if (!set.add(str) && !duplicates.contains(str)) {
                duplicates.add(str);
            }
        }
        return duplicates;
    }
}
