package homework;

public enum Command {
    С("шаг на север"),
    Ю("шаг на юг"),
    З("шаг на запад"),
    В("шаг на восток");
    private String step;

    Command(String step) {
        this.step = step;
    }

    public String getStep() {
        return step;
    }
}
