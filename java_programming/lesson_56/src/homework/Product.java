package homework;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private double price;
    private int amount;

    private transient int discount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
