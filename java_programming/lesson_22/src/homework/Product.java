package homework;

public class Product {
    protected static int id;
    private String name;
    protected double price;

    public Product(String name, double price) {
        id++;
        this.name = name;
        this.price = price;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public String toString() {
        return name + ", price: " + price;
    }

    public void buy(ShoppingCart cart){}
}
