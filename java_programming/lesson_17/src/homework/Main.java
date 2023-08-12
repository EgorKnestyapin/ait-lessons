package homework;

public class Main {
    /* #1 Создать класс Car со следующими полями (String brand, String color, String licensePlate,
    MyDate registrationDate, Engine engine}
    Обратите внимание, поля registrationDate и engine - это тоже объект. Engine - содержмт информация о мощности
    двигателя и о типе (бензин, дизель, электро).
        Реализуйте метод toString в каждом классе.
        Реализуйте метод конструктор в каждом классе.
        Создайте два объекта автомобтля.
    #2 В классе Engine добавте методы start и stop. Кадлый из них пусть выводит строку "Engine is started"
    "Engine is stoped". В классе Car добавте методы drive и stop. Первый должке заводить двигатель и писать,
    что такая то машина поехала. Второй, соответственно глушить двигатель и останавливать машину.
    #3 ** Реализовать проверку, если машина уже едет, а я пытвюсь вызвать метод drive, должно появлятся сообщение,
    что машина уже едет.
     */
    public static void main(String[] args) {
        Engine engine1 = new Engine(120, "Diesel");
        MyDate date1 = new MyDate(2,5,2021);
        Car car1 = new Car("Toyota", "Red", "PX353536", date1, engine1);

        Engine engine2 = new Engine(150, "Petrol");
        MyDate date2 = new MyDate(27,7,2019);
        Car car2 = new Car("Ford", "Black", "CV768433", date2, engine2);

        System.out.println(car1);
        System.out.println();
        System.out.println(car2);

        car1.drive();
        car1.stop();
        car1.drive();
    }
}
