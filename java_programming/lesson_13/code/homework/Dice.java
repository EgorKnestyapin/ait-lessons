package homework;

public class Dice {
    public static void main(String[] args) {
        // Напишите метод, который имитирует бросание игрового кубика. На вход методу подается число бросков,
        // на выходе метод возвращает результаты всех бросков.
        int n = 7;
        int[] result = rollDice(n);
        for (int num : result) {
            System.out.println(num);
        }
    }

    public static int[] rollDice(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = (int) (Math.random() * (6 - 1 + 1) + 1);
        }
        return result;
    }
}
