package homework;

public class ToBeOrNotToBe {
    public static void main(String[] args) {
        // Имеется строка "Быть или не быть". Распечатайте эту строку в обратном порядке.
        String toBeOrNotToBe = "Быть или не быть";

        int i = 1;
        while (toBeOrNotToBe.length() - i >= 0) {
            System.out.print(toBeOrNotToBe.charAt(toBeOrNotToBe.length() - i));
            i++;
        }
    }
}
