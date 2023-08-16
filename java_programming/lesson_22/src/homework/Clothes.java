package homework;

public class Clothes extends Product{
    public Clothes(String name, double price) {
        super(name, price);
        super.id++;
    }

    @Override
    public void buy(ShoppingCart cart) {
        cart.add(this);
    }
}
