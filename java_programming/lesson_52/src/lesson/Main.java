package lesson;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        writeFile("Hello");
    }


    public static void writeFile(String str) {
        try(FileWriter fileWriter = new FileWriter("text.txt")) {
            for (char ch : str.toCharArray()) {
                fileWriter.write(ch);
            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
