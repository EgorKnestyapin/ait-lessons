package homework.task2;

public class Telephone {
    private String name;
    private String display;
    private String processor;
    private int memory;
    private int battery;
    private String size;

    public Telephone(String display, String processor, int memory, int battery, String size) {
        this.display = display;
        this.processor = processor;
        this.memory = memory;
        this.battery = battery;
        this.size = size;
    }

    public String getDisplay() {
        return display;
    }

    public String getProcessor() {
        return processor;
    }

    public int getMemory() {
        return memory;
    }

    public int getBattery() {
        return battery;
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "display='" + display + '\'' +
                ", processor='" + processor + '\'' +
                ", memory=" + memory +
                ", battery=" + battery +
                ", size='" + size + '\'' +
                '}';
    }

    public void takePhoto() {
        System.out.println(name + " takes cool photos");
    }
}
