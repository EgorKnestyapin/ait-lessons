package homework;

import java.util.*;

public class Robot {
    public List<Command> makeBetterTrajectory(String str) {
        if (str == null || str.isEmpty()) throw new NullPointerException("Commands string is null");
        Deque<Command> queue = new ArrayDeque<>();
        String[] stringsArr = str.split("");
        for (int i = 0; i < str.length(); i++) {
            String commandStr = stringsArr[i];
            Command command = Command.valueOf(commandStr);
            try {
                if (!queue.isEmpty() && queue.peekLast().isOpposite(command)) {
                    queue.removeLast();
                } else {
                    queue.add(command);
                }
            } catch (IllegalArgumentException e) {
            }
        }
        return new ArrayList<>(queue);
    }

    public List<String> routeRecording(String commands) {
        if (commands == null || commands.isEmpty()) throw new NullPointerException("Commands string is null");
        List<String> routeStr = new ArrayList<>();
        String[] stringsArr = commands.split("");
        for (int i = 0; i < stringsArr.length; i++) {
            String str = stringsArr[i];
            Command command = Command.valueOf(str);
            try {
                routeStr.add(i + 1 + ". " + Command.valueOf(str).getStep());
            } catch (IllegalArgumentException e) {
            }
        }
        return routeStr;
    }
}
