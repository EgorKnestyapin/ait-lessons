package homework;

import java.io.*;

public class ReaderProd {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "java_programming/lesson_56/src/homework/product.txt";
        readProduct(fileName);
    }
    // Задача 2. Создать отдельную программу, которая загружает данные о товаре.
    public static void readProduct(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName))) {
            Product prod = (Product) is.readObject();
            System.out.println(prod.toString());
        }
    }
}
