package setDemo;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("str1");
        set1.add("str2");
        set1.add("str3");
        set1.add("str4");
        System.out.println(set1);

        System.out.println("------------------");
        for (String str : set1) {
            System.out.println(str);
        }
    }
}
