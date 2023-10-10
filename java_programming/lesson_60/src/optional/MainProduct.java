package optional;

import java.util.List;
import java.util.Optional;

public class MainProduct {
    // Создайте лист из продуктов - 3-5 продуктов. Пусть в продукте будут поля: название и цена.
    // Создайте метод getProductByTitle - пусть метод принимает название, по которому будет искать, и список
    // продуктов и возвращает продукт с указанным названием. Если продукта нет, то возвращает продукт "doll" с
    // ценой 15
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("iphone", 1000),
                new Product("chair", 20),
                new Product("guitar", 100),
                new Product("table", 40)
        );
        Product hasIphone = getProductByTitle(products, "iphone");
        System.out.println(hasIphone); // Product{title='iphone', price=1000.0}
        Product hasDrum = getProductByTitle(products, "drum");
        System.out.println(hasDrum); // Product{title='doll', price=15.0}
    }

    public static Product getProductByTitle(List<Product> products, String productTitle) {
        Optional<Product> foundProduct = products.stream()
                .filter(product -> product.getTitle().equalsIgnoreCase(productTitle))
                .findAny();
        return foundProduct.orElse(new Product("doll", 15));
    }
}
