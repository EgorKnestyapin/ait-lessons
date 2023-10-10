package optional;

import java.util.List;
import java.util.Optional;

public class Product {
    private String title;
    private double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public static Product getProductByTitle(List<Product> products, String productTitle) {
        Optional<Product> foundProduct = products.stream()
                .filter(product -> product.getTitle().equalsIgnoreCase(productTitle))
                .findAny();
        return foundProduct.orElse(new Product("doll", 15));
    }
}
