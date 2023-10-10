package homework;

import java.util.Arrays;
import java.util.List;

public class Main {
    /* Создайте класс товар Product с полями:
    название
    рейтинг
    цена
    категория
    Создайте лист из 10 товаров с разными значениями
     */
    public static void main(String[] args) {
        List<Product> productList = List.of(
                new Product("title1", 3.5, 123, "category1"),
                new Product("title2", 3.7, 452, "category2"),
                new Product("title3", 2.5, 125, "category3"),
                new Product("Iphone XR", 3.2, 257, "category4"),
                new Product("title5", 1.5, 127, "category5"),
                new Product("title6", 2.3, 241, "category6"),
                new Product("title7", 3.3, 386, "category7"),
                new Product("title8", 2.1, 132, "category8"),
                new Product("title9", 1.6, 281, "category9"),
                new Product("title10", 4.0, 137, "category10")
        );
        // Задание 1. Получите лист товаров, которые стоят дороже 200 евро.
        System.out.println("================== Task1 ===================");
        List<Product> productsPriceMoreThan200 = productList.stream()
                .filter(product -> product.getPrice() > 200)
                .toList();
        productsPriceMoreThan200.forEach(product -> System.out.println(product));

        // Задание 2. Получите лист товаров, отсортированных по рейтингу
        System.out.println("================== Task2 ===================");
        List<Product> productsSortedRating = productList.stream()
                .sorted((a, b) -> Double.compare(a.getRating(), b.getRating()))
                .toList();
        productsSortedRating.forEach(product -> System.out.println(product));

        // Задание 3. Проверьте есть ли в листе товаров, товар с названием: "Iphone XR"
        System.out.println("================== Task3 ===================");
        boolean iphoneXr = productList.stream()
                .anyMatch(product -> product.getTitle().equalsIgnoreCase("Iphone XR"));
        System.out.println(iphoneXr);

        // Задание 4 map. Создайте новый лист товаров на основании старого, пусть в новом листе рейтинг будет
        // увеличен на 1. Товары в исходном листе не должны измениться.
        System.out.println("================== Task4 ===================");
        List<Product> productsRatingPlusOne = productList.stream()
                .map(p -> new Product(p.getTitle(), p.getRating() + 1, p.getPrice(), p.getCategory()))
                .toList();
        productsRatingPlusOne.forEach(product -> System.out.println(product));
        /*    List<Product> newProducts = products
        .stream()
        // вариант с мапом - но для сайд эффектов можно использовать peek
//        .map(p -> {
//          p.setRating(p.getRating() + 1);
//          return p;
//        })
        .peek(p -> p.setRating(p.getRating() + 1)) // как forEach, но не терминальный
        .toList();
    System.out.println(products);
         */

        // Задание 5 forEach. Измените цену товаров в исходном листе товаров: увеличьте ее на 20 евро.
        // Товары в исходном листе должны измениться.
        System.out.println("================== Task5 ===================");
        productList.forEach(product -> product.setPrice(product.getPrice() + 20));
        productList.forEach(product -> System.out.println(product));

        // Задание 6 reduce. Посчитайте общую стоимость всех товаров в листе.
        System.out.println("================== Task6 ===================");
        Double reducedPrice = productList.stream()
                .map(product -> product.getPrice())
                .reduce(0.0, (a, b) -> a + b);
        System.out.println(reducedPrice);
    }
}
