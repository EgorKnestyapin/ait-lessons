package homework;

public class Engine {
    private double power;
    private String type;

    public Engine(double power, String type) {
        this.power = power;
        this.type = type;
    }

    public String toString() {
        return "Engine power - " + power + " and his type - " + type;
    }

    public void start() {
        System.out.println("Engine is started");
    }

    public void stop() {
        System.out.println("Engine is stopped");
    }
}
