package lesson;

public class Main {
    public static void main(String[] args) {
        Employee pr = new Programmer("John", 22);
        System.out.println(pr);

        ((Programmer)pr).work();
    }
}
