package homework;

public class Coordinate {
    public static void main(String[] args) {
        /* Задача 2. В программе задаются случайным образом две целочисленные координаты x и y в интервале от -10 до 10.
        Определите, в какую четверть попадает точка с координатами ( x, y).
         */
        int a = -10;
        int b = 10;
        int x = (int)(Math.random() * (b - a + 1) + a);
        System.out.println("x = " + x);
        int y = (int)(Math.random() * (b - a + 1) + a);
        System.out.println("y = " + y);
        if (x > 0) {
            if (y > 0) {
                System.out.println("Первая четверть");
            } else if (y < 0) {
                System.out.println("Четвертая четверть");
            }
        } else if (x < 0) {
            if (y > 0) {
                System.out.println("Вторая четверть");
            } else if (y < 0) {
                System.out.println("Третья четверть");
            }
        } else {
            System.out.println("Никакая четверть");
        }
    }
}
