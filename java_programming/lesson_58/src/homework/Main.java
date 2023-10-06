package homework;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Дан список  BankAccount { Peroson person, String IBAN, double balance). Используя знания о stream необходимо
        сформировать лист из:
        BankAccount, баланс которых составляет менее 100.
        Person  баланс которых составляет больше заданного N.
        */
        List<BankAccount> bankAccounts = getBankAccounts();

        List<BankAccount> list = bankAccounts.stream()
                .filter(bankAccount -> bankAccount.getBalance() < 100)
                .toList();
        list.forEach(bankAccount -> System.out.println(bankAccount));

        final int N = 400;
        List<Person> list1 = bankAccounts.stream()
                .filter(bankAccount -> bankAccount.getBalance() > N)
                .map(bankAccount -> bankAccount.getPerson())
                .toList();
        list1.forEach(person -> System.out.println(person));

        System.out.println("===========================================");
        /* Дан список Programmer(String name, String city, List<Task>  tasks). Каждый программист  имеет список задач
        Task (int Number, String description, Status status). Естественно,  Status это enum.  Сформировать список из
        всех незавершенных задач (т.е. имеют статус, отличный от «DONE») , которые относятся к программистам из Берлина.
         */
        List<Programmer> programmers = getProgrammers();
        List<Task> berlinNotDoneList = programmers.stream()
                .filter(programmer -> programmer.getCity().equals("Berlin"))
                .map(programmer -> programmer.getTasks())
                .flatMap(tasks -> tasks.stream())
                .filter(task -> !task.getStatus().equals(Status.DONE))
                .toList();
        berlinNotDoneList.forEach(task -> System.out.println(task));
    }

    private static List<BankAccount> getBankAccounts() {
        List<Person> listPerson = List.of(
                new Person("Ivan", "Polyakov", "ivan@gmail.com", "+3241512",
                        new Address("124524", "Moscow", "Bolotnaya", "24-1")),
                new Person("fName1", "lName1", "ivan@gmail.com", "+3241512",
                        new Address("124524", "Moscow", "Bolotnaya", "24-1")),
                new Person("fName2", "lName2", "ivan2@gmail.com", "+2222",
                        new Address("124524", "Moscow", "Bolotnaya", "25-1")),
                new Person("Jack", "London", "jack@gmail.com", "+512412",
                        new Address("42151", "London", "Compton", "27-2")));
        List<BankAccount> bankAccounts = List.of(
                new BankAccount(listPerson.get(0), "2352623", 214.31),
                new BankAccount(listPerson.get(1), "7569565", 73.24),
                new BankAccount(listPerson.get(2), "5151313", 422.43),
                new BankAccount(listPerson.get(3), "6457457", 56.2));
        return bankAccounts;
    }

    private static List<Programmer> getProgrammers() {
        List<Task> tasks1 = List.of(
                new Task(1, "desc1", Status.IN_PROGRESS),
                new Task(2, "desc2", Status.OPEN),
                new Task(3, "desc3", Status.DONE)
        );
        List<Task> task2 = List.of(
                new Task(4, "desc4", Status.REOPENED),
                new Task(5, "desc5", Status.DONE),
                new Task(6, "desc6", Status.RESOLVED)
        );
        List<Programmer> programmers = List.of(
                new Programmer("Ivan", "Moscow", tasks1),
                new Programmer("Bertold", "Berlin", task2)
        );
        return programmers;
    }
}
