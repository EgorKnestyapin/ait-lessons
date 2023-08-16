package homework.task2;

public class Samsung extends Telephone {
    public Samsung(String display, String processor, int memory, int battery, String size) {
        super(display, processor, memory, battery, size);
    }

    @Override
    public void takePhoto() {
        System.out.println(super.getName() + "takes amazing photos");
    }
}
