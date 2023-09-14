package treeset;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(-1);
        set.add(10);
        set.add(553);
        set.add(-66);
        set.add(0);
        System.out.println(set);

        Set<Person> set1 = new TreeSet<>();
        set1.add(new Person("Jack", 20));
        set1.add(new Person("Ann", 21));
        set1.add(new Person("Nick", 25));
        set1.add(new Person("Stan", 23));
        set1.add(new Person("Nick", 18));
        System.out.println(set1);
    }
}
