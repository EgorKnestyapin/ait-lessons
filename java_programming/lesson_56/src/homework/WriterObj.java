package homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriterObj {
    public static void main(String[] args) throws IOException {
        Product prod = new Product("Phone", 1000, 130);
        String fileName = "java_programming/lesson_56/src/homework/product.txt";
        writeObject(prod, fileName);
    }
    /* Задача 1
    Создать класс товар, с несколкими полями (наименование, ценаб количество). Создать объект этого класса.
    Выгрузить этот объект используя ObjectOutputStream
    */
    public static void writeObject(Object obj, String fileName) throws IOException {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName))) {
            os.writeObject(obj);
        }
    }
}
