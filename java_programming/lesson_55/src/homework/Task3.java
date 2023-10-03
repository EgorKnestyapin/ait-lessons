package homework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3 {
    // Задача 3 Записать каждую строку двумерного массива byte[][] (например, из второй задачи) в отдельный файл.
    public static void main(String[] args) {
        String[] arr = {"hello", "wonderful", "world", "!"};
        byte[][] arr1 = Task2.covertToByteArr(arr);
        writeByteArr(arr1);
    }
    public static void writeByteArr(byte[][] arr) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("java_programming/lesson_55/src/homework/file.txt")) {
            for (int i = 0; i < arr.length; i++) {
                fileOutputStream.write(arr[i]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
