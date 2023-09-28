package lesson;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        readWrite();
    }
    public static void readWrite() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("result.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("buf2.txt"))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
