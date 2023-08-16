package homework;

public class Foodstuff extends Product{
    private int priceUrgency = 30;
    public Foodstuff(String name, double price) {
        super(name, price);
        super.id++;
    }

    @Override
    public void buy(ShoppingCart cart) {
        super.price += priceUrgency;
        System.out.println("The price of " + super.getName() + " has been increased by " + priceUrgency
                + " due to urgency");
        cart.add(this);
    }
}
