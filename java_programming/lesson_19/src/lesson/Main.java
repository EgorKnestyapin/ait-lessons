package lesson;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jack");
        System.out.println(student1);

        SmartArray array = new SmartArray();
        array.add(1);
        System.out.println(array);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(2);
        System.out.println(array);

        student1.addRate(4);
        System.out.println(student1);
    }
}
