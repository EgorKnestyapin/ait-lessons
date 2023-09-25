package homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        try {
            System.out.println(robot.makeBetterTrajectory("ГГГГГСВЗЮСВ"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(robot.makeBetterTrajectory("СВЗЮСВ"));
        System.out.println(robot.routeRecording("СВЗЮС"));
    }
}
