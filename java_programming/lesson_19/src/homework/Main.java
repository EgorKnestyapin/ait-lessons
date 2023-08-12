package homework;

public class Main {
    public static void main(String[] args) {
        SmartArray smartArray = new SmartArray();
        smartArray.inputOutputNumbers();

        /* Допустим, мы пишем on-line магазин. У нас есть класс Товар ( придумайте, какие поля должны быть).
        Реализуйте класс Корзинка, в которую можно добавить несколько товаров. Реализовать метод добавления и
        добавления товара в корзину. Реализовать метод, который распечатает весь заказ.
        Реализовать метод, который вернет сумму заказа.
         */
        Product product1 = new Product("Orange", 120, 78);
        Product product2 = new Product("Pineapple", 500, 45);
        ShoppingCart shoppingCart1 = new ShoppingCart();
        shoppingCart1.add(product1);
        shoppingCart1.add(product2);
        System.out.println(shoppingCart1);
        System.out.println(shoppingCart1.getTotalPrice());
    }
}
