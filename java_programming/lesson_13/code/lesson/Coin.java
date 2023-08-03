package lesson;

public class Coin {
    public static void main(String[] args) {
        /* Задание 2. Написать методы, реализующие имитацию:
        бросание монеты
        стрельбу по мишени (вар 1 - попал/не попал, вар 2 - результат от 0 до 10).
        На вход методов подается ко-во попыток, метод должен вернуть результаты попыток.
         */
        int n = 5;
        for (int i : flipCoins(n)) {
            System.out.println(i);
        }
    }

    public static int[] flipCoins(int n) {
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = (int) (Math.random() * (1 - 0 + 1) + 0);
        }
        return coins;
    }
}
