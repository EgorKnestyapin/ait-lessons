package homework;

public class Product {
    private String name;
    private double price;
    private int quantityInStock;
    private String description = "";

    public Product(String name, double price, int quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantity;
        this.description = description;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return name + ", price: " + price + ", quantity in stock: " + quantityInStock + " " + description;
    }
}
