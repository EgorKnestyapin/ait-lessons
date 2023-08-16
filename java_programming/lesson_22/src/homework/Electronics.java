package homework;

public class Electronics extends Product{
    public Electronics(String name, double price) {
        super(name, price);
        super.id++;
    }

    @Override
    public void buy(ShoppingCart cart) {
        issueGuarantee();
        cart.add(this);
    }

    public void issueGuarantee() {
        System.out.println("The warranty for the " + super.getName() + " product has been successfully issued");
    }
}
