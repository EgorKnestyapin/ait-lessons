package threads;

public class EggThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "Egg");
        }
    }
    // rooster - петушок, hen - курочка, chick - цыпленок, chicken - курятина
}
