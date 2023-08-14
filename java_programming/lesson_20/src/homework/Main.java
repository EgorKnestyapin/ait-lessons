package homework;

public class Main {
    public static void main(String[] args) {
        SmartArray smartArray = new SmartArray();
        smartArray.add(2);
        smartArray.add(6);
        smartArray.add(4);
        smartArray.add(1);
        smartArray.add(7);
        System.out.println(smartArray);
        smartArray.removeByIndex(2);
        System.out.println(smartArray);
    }
}
