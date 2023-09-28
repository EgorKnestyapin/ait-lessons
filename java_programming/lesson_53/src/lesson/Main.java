package lesson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Charset.availableCharsets());
        read();
    }

    public static void read() {
        try (FileReader fileReader = new FileReader("result.txt", Charset.forName("KOI8-R"))) {
            char[] data = new char[10];
            int count;
            while ((count = fileReader.read(data)) != -1) {
                if (count == data.length) {
                } else {
                    data = Arrays.copyOf(data, count);
                }
                System.out.println(Arrays.toString(data));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
