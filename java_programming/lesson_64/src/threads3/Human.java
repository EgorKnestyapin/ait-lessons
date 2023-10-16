package threads3;

public class Human extends Thread {
    private final CreditCard creditCard;
    private String name;

    public Human(String name, CreditCard creditCard) {
        this.creditCard = creditCard;
        this.name = name;
    }

    @Override
    public void run() {
        // человек идет делать покупки - 100 покупок (насколько хватит денег)
        for (int i = 0; i < 100; i++) {
            synchronized (creditCard) {
                // проверим, есть ли на счету деньги
                System.out.println(name + " проверяет баланс, есть ли деньги");
                if (creditCard.getAmount() >= 10) {
                    System.out.println("Иду покупать");
                    if (creditCard.buy(10)) {
                        System.out.println(name + " купил");
                    } else {
                        System.out.println(name + " Это что вообще было?");
                    }
                } else {
                    System.out.println("Деньги кончились");
                    return;
                }
            }
        }
    }
}
