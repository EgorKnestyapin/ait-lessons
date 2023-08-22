package ait.string;

public class StringPerformanceTest {
    private static final int N_ITERATION = 150_000;
    private static final String WORD = "meow";

    public static void main(String[] args) {
        //String
        String str = "";
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < N_ITERATION; i++) {
            str = str + WORD;
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);

        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder("");
        long a1 = System.currentTimeMillis();
        for (int i = 0; i < N_ITERATION; i++) {
            stringBuilder.append(WORD);
        }
        str = stringBuilder.toString();
        long a2 = System.currentTimeMillis();
        System.out.println(a2 - a1);
    }
}
