package homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        makeCopyWithReplacedChar("result.txt", 'l', 'k');
    }

    /* Задача 1
    Напишите програму, которая позволяет вользователю ввести несколько строк текста (используя Scanner) и записать их в
    текстовый файл (result.txt). Признаком того, что пользователь закончил ввод текста, должна служить введенная строка
    "exit" (естественно, она не должна попадать в итоговый файл.
     */
    public static void writeStrings() {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter fileWriter = new FileWriter("result.txt")) {
            System.out.println("Input string for writing:");
            String stringForWrite = scanner.next();
            while (!stringForWrite.equals("exit")) {
                fileWriter.write(stringForWrite);
                System.out.println("Input next string('exit'-to stop writing):");
                stringForWrite = scanner.next();
            }
        } catch (IOException e) {
            System.out.println("Error while writing file");
        }
    }

    /* Задача 2
    Дан файл с текстом, например из первой задачи (result.txt). Ваша задача прочитать этот файл и создать на диске
    его копию, в которой все символы заданные параметром ch1 будут заменены символом заданным в ch2.
    Например:
    Файл 1: "Есть только миг" ch1='г' ch2='ф'
    Файл 2: "Есть только миф"
     */
    public static void makeCopyWithReplacedChar(String fileName, char ch1, char ch2) {
        try (FileWriter fileWriter = new FileWriter("copy_" + fileName);
             FileReader fileReader = new FileReader(fileName)) {
            int charRead;
            while ((charRead = fileReader.read()) != -1) {
                if ((char) charRead == ch1) {
                    fileWriter.write(ch2);
                } else {
                    fileWriter.write(charRead);
                }
            }
        } catch (IOException e) {
            System.out.println("Error while writing file");
        }
    }
}
