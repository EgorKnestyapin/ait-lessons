package homework;

public class Main {
    public static void main(String[] args) {
        System.out.println(doSomethingWithString("1234567891012131"));
        // System.out.println(doSomethingWithString("12345"));

        try {
            System.out.println(createAccountIfNumberValid("DE1234567891011"));
        } catch (IllegalArgumentException | AccountFormatException | WrongAccountCountryCodeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(createAccountIfNumberValid("D51234567891011"));
        } catch (IllegalArgumentException | AccountFormatException | WrongAccountCountryCodeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(createAccountIfNumberValid("DE123456"));
        } catch (IllegalArgumentException | AccountFormatException | WrongAccountCountryCodeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(createAccountIfNumberValid(null));
        } catch (IllegalArgumentException | AccountFormatException | WrongAccountCountryCodeException e) {
            e.printStackTrace();
        }
    }

    /* Задача 1
    Написать метод, который получает в качестве параметра строку длинной 16 символов и,
    если строка не соответствует этому требованию выбрасывает IllegalArgumentException
     */
    public static boolean doSomethingWithString(String str) {
        if (str.length() < 16 || str.length() > 16) {
            throw new IllegalArgumentException("String length is less or more than 16 ");
        }
        return true;
    }

    /* Задача 2
    Представьте, вы пишете банковскую программу. Создайте два checked exception: AccountFormatException и
    WrongAccountCountryCodeException. Напишите метод, который получает строку с номером вида: DE171271782891.
    Если строка короче 14 символов или длиннее 16 - > AccountFormatException. Если строка не начинается с символов
    "DE" - WrongAccountCountryCodeException, если что-то другое (например передан null) -> IllegalArgumentException.
    При нормальном потоке выполнения, метод создает новый объект Account и возвращает его.
    Напишите вызов вашего метода с обработкой возможных исключений.
     */
    public static Account createAccountIfNumberValid(String number) throws AccountFormatException, WrongAccountCountryCodeException {
        if (number == null) {
            throw new IllegalArgumentException("Not correct number");
        }
        if (number.length() < 14 || number.length() > 16) {
            throw new AccountFormatException("Account number length is less than 14 or more than 16");
        }
        if (!number.startsWith("DE")) {
            throw new WrongAccountCountryCodeException("Number does not start with 'DE'");
        }
        return new Account(number);
    }
}
