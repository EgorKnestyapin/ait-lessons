package date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        // Unix Timestamp количество миллисекунд с 1970 года 1 января
        System.out.println(date.getTime());
        System.out.println(date);

        // 1997 Calendar - для работы с классом Date - в нем есть более адекватные методы
        Calendar calendar = new GregorianCalendar();
        Date current = calendar.getTime();
        System.out.println(current);
        calendar.set(Calendar.DATE, 15);
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
        System.out.println(calendar.getTime());

        // Пример создания календаря сразу
        Calendar calendar1 = new GregorianCalendar(2022, Calendar.JANUARY, 28);

        // roll - изменяет дату на переданное значение
        calendar1.roll(Calendar.DATE, -10);

        // Как вас зовут? Дата рождения? Тогда вам 45
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Привет! Как тебя зовут?");
        String name = br.readLine();
        System.out.println("Приятно познакомиться, " + name + ". Какого ты года рождения?");
        int yearOfBirth = Integer.parseInt(br.readLine());
        int age = new GregorianCalendar().get(Calendar.YEAR) - yearOfBirth;
        System.out.println("Значит, тебе " + age + ", либо " + (age - 1));
    }
}
