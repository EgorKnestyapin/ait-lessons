package homework;

public class Car {
    String brand;
    String color;
    String licensePlate;
    MyDate registrationDate;
    Engine engine;

    private boolean isDriven;

    public Car(String brand, String color, String licensePlate, MyDate registrationDate, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.registrationDate = registrationDate;
        this.engine = engine;
    }

    public String toString() {
        return "Brand: " + brand + "\nColor: " + color + "\nLicense plate: " + licensePlate + "\nRegistration date:" +
                "\nEngine: " + engine;
    }

    public void drive() {
        if (isDriven) {
            System.out.println(color + " " + brand + " is already driven");
        } else {
            engine.start();
            System.out.println(color + " " + brand + " is driven");
            isDriven = true;
        }
    }

    public void stop() {
        if (!isDriven) {
            System.out.println(color + " " + brand + " is already stopped");
        } else {
            engine.stop();
            System.out.println(color + " " + brand + " is stopped");
            isDriven = false;
        }
    }
}
