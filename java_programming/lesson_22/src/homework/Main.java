package homework;

public class Main {
    public static void main(String[] args) {
        Product pr1 = new Foodstuff("Orange", 78);
        Foodstuff pr2 = new Foodstuff("Apple", 65);
        Clothes pr3 = new Clothes("Dress", 605);
        Product pr4 = new Electronics("Telephone", 1003);

        ShoppingCart cart = new ShoppingCart();
        pr1.buy(cart);
        System.out.println(cart);
        pr2.buy(cart);
        pr3.buy(cart);
        pr4.buy(cart);
        System.out.println(cart);
        System.out.println(cart.getTotalPrice());
    }
}
