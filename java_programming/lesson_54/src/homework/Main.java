package homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(601, 57053, 22494));
        readWriteFiles("file.dat", list);
        getFileHexDisplay("file1");
        copyFile("file1", "java_programming/lesson_54/src/homework/Main.class");
    }

    public static void readWriteFiles(String fileName, List<Integer> bytesAmountList) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             FileOutputStream fileOutputStream1 = new FileOutputStream("file1");
             FileOutputStream fileOutputStream2 = new FileOutputStream("file2");
             FileOutputStream fileOutputStream3 = new FileOutputStream("file3");) {
            List<FileOutputStream> fileOutputStreams = List.of(fileOutputStream1, fileOutputStream2, fileOutputStream3);
            byte[] data = fileInputStream.readAllBytes();
            int bottomLine = 0;
            for (int i = 0; i < bytesAmountList.size(); i++) {
                fileOutputStreams.get(i).write(data, bottomLine, bytesAmountList.get(i));
                bottomLine += bytesAmountList.get(i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileHexDisplay(String fileName) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.printf("%02x", data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copyFile(String oldFileName, String newFileName) {
        try (FileInputStream fileInputStream = new FileInputStream(oldFileName);
             FileOutputStream fileOutputStream = new FileOutputStream(newFileName)) {
            fileInputStream.transferTo(fileOutputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
