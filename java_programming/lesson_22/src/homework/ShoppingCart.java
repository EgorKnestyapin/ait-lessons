package homework;

public class ShoppingCart {
    private int size = 0;
    private Product[] products = new Product[4];

    public void add(Product product) {
        if (size >= products.length) {
            increaseArray();
        }
        products[size] = product;
        size++;
    }

    public void increaseArray() {
        Product[] tempArray = new Product[products.length * 2];
        for (int i = 0; i < products.length; i++) {
            tempArray[i] = products[i];
        }
        products = tempArray;
    }

    public Product[] getCartAsArray() {
        Product[] tempArray = new Product[products.length];
        for (int i = 0; i < products.length; i++) {
            tempArray[i] = products[i];
        }
        return tempArray;
    }
    public String toString() {
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += " " + products[i] + "\n";
        }
        return res + "]";
    }

    public String getTotalPrice() {
        double price = 0;
        for (int i = 0; i < size; i++) {
            price += products[i].getPrice();
        }
        return "Total price: " + price;
    }
}
