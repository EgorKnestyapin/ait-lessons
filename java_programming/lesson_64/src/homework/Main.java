package homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========== Task 1 ===========");
        System.out.println(getAge(50, 2007));
        System.out.println("=========== Task 2 ===========");
        List<Task> tasks = List.of(
                new Task("Water flowers", "desc1", LocalDate.of(2023, 10, 12)),
                new Task("Vacuum the floor", "desc2", LocalDate.of(2023, 10, 21)),
                new Task("Wash the clothes", "desc3", LocalDate.of(2023, 10, 25))
        );
        System.out.println(getUpperCaseTitleTaskNextTenDays(tasks));
        System.out.println(changeStatusSaturdayTask(tasks));
        System.out.println(procrastinateAllTasksForOneDay(tasks));

        /* Задание 3 Achilles And The Tortoise
        Создайте два потока: Ахилес (AchillesThread) и черепаха(TortoiseThread). Пусть в потоке Ахилес выводится
        фраза "I run fast" с интервалом полсекунды 30 раз. Пусть в потоке черепахи выводится фраза "I just run" c
        интервалом две секунды 12 раз. После того как эти потоки завершат работу выведите в консоль
        фразу - "Achilles can never overtake the tortoise?"
         */
        System.out.println("=========== Task 3 ===========");
        AchillesThread achillesThread = new AchillesThread();
        TortoiseThread tortoiseThread = new TortoiseThread();
        achillesThread.start();
        tortoiseThread.start();
        try {
            achillesThread.join();
            tortoiseThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Achilles can never overtake the tortoise?"); // Похоже, что черепаха никогда не догонит Ахиллеса
    }

    /* Задание 1. Period, LocalDate (опциональное)
    Сегодня возраст нашего героя - 50 лет, сколько лет ему было в 2007
     */
    public static int getAge(int age, int year) {
        Period period = Period.between(
                LocalDate.of(2023, 10, 16),
                LocalDate.of(year, 10, 16)
        );
        return age - Math.abs(period.getYears());
    }

    /* Задание 2 Лист задач (опциональное)
    Создайте класс Task с полями:
    title
    description
    status
    date - LocalDate С методами:
    switchStatus
    changeTitle(String title)
    Пусть задача создается со статусом не выполнено. Создайте лист задач. Пусть хотя бы одна будет на эту субботу.
    Дополнительно:
    Поменяйте название на прописные буквы для тех задач, которые будут в течение 10 дней с настоящего момента.
    Поменяйте статус у задач, которые назначены на субботу.
    Напишите метод procrastinate - который откладывает задачу на один день.
    Отложите все задачи листа на один день.
     */
    public static List<Task> getUpperCaseTitleTaskNextTenDays(List<Task> tasks) {
        List<Task> list = new ArrayList<>(tasks);
        List<Task> res = list.stream()
                .filter(task -> {
                    Period period = Period.between(
                            LocalDate.of(2023, 10, 16),
                            task.getDate()
                    );
                    return period.getDays() >= 0 && period.getDays() <= 10;
                })
                .map(task -> new Task(task.getTitle().toUpperCase(), task.getDescription(), task.getDate()))
                .toList();
        return res;
    }

    public static List<Task> changeStatusSaturdayTask(List<Task> tasks) {
        List<Task> list = new ArrayList<>(tasks);
        List<Task> res = list.stream()
                .filter(task -> task.getDate().getDayOfWeek() == DayOfWeek.SATURDAY)
                .peek(Task::switchStatus)
                .toList();
        return res;
    }

    public static void procrastinate(Task task) {
        task.setDate(task.getDate().plusDays(1));
    }

    public static List<Task> procrastinateAllTasksForOneDay(List<Task> tasks) {
        List<Task> list = new ArrayList<>(tasks);
        list.forEach(Main::procrastinate);
        return list;
    }
}
