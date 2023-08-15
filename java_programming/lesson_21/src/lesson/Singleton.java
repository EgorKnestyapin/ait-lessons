package lesson;

public class Singleton {
    private static Singleton INSTANCE;
    public int temp;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
    public void print() {
        System.out.println(temp);
    }
}
