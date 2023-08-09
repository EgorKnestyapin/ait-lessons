package homework;

public class Main {
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
