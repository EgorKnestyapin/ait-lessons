package homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> data = List.of("DE1613321892788;Jack Johnson", "DR16133247;Ivan Ivanov",
                "DE16123227565;");
        List<Account> bankAccounts = new ArrayList<>();
        for (String str : data) {
            try {
                bankAccounts.add(createAccountIfDataCorrect(str));
            } catch (AccountCreationException e) {
                System.out.println(" ----------- " + str + " ------------");
                System.out.println(e.getExceptions());
            }
        }
        System.out.println(bankAccounts);
    }

    /* Дан список строк вида:
    DE1613321892788;Jack Johnson
    DE1613324427567;Ivan Ivanov
    DE1612324427565;Ann Smith
    т.е. список банковских счетов с именем владельца. К сожалению, список пришел некорректный: у некоторых счетов
    отсутствуют имена владельцев, некоторые счета не начинаются на DE или короче 15 символов.
    Ваш метод должен сформировать список объектов типа Account (String iban, Person owner), ЕСЛИ ВСЕ ЗАПИСИ корректны,
    либо выкинуть exception. Причем в последнем случае, должна быть сохранена информация о том,
    какие строки и какие проблемы содержали.
     */
    public static Account createAccountIfDataCorrect(String data) throws AccountCreationException {
        List<String> messagesException = new ArrayList<>();
        AccountCreationException exceptions = new AccountCreationException(messagesException);
        String[] ibanAndOwner = data.split(";");
        String iban = ibanAndOwner[0];

        if (data == null) {
            messagesException.add("Data is null");
        }
        if (ibanAndOwner.length != 2) {
            messagesException.add("Missing owner data");
        }
        if (iban.length() < 15) {
            messagesException.add("Iban length is less than 15 symbols");
        }
        if (!iban.startsWith("DE")) {
            messagesException.add("Iban must start with 'DE'");
        }
        if (!messagesException.isEmpty()) throw exceptions;

        String[] nameSurname = ibanAndOwner[1].split(" ");
        Person person = new Person(nameSurname[0], nameSurname[1]);

        return new Account(iban, person);
    }
}
