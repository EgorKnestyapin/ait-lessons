package threads;

public class Main {
    public static void main(String[] args) {
        // Что было раньше, курицо или яйцо?
        HenThread henThread = new HenThread();
        EggThread eggThread = new EggThread();
        // Как запустить поток? start()
        henThread.start();
        eggThread.start();
        // непредсказумо, недетерминированно
    }
}
