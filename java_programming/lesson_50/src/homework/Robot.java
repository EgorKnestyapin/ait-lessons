package homework;

import java.util.*;

public class Robot {
    private static Map<String, Command> map = Map.of(
            "С", Command.Ю,
            "Ю", Command.С,
            "З", Command.В,
            "В", Command.З
    );

    public List<Command> makeBetterTrajectory(String str) {
        if (str == null || str.isEmpty()) throw new NullPointerException("Commands string is null");
        Deque<Command> queue = new ArrayDeque<>();
        String[] stringsArr = str.split("");
        for (int i = 0; i < str.length(); i++) {
            String command = stringsArr[i];
            if (!map.containsKey(command)) throw new IllegalArgumentException("Incorrect commands");
            if (!queue.isEmpty() && map.get(command) == (queue.peek())) {
                queue.removeFirst();
            } else {
                queue.addFirst(Command.valueOf(command));
            }
        }
        int counter = queue.size();
        List<Command> commands = new ArrayList<>();
        for (int i = 0; i < counter; i++) {
            commands.add(queue.pollLast());
        }
        return commands;
    }

    public List<String> routeRecording(String commands) {
        if (commands == null || commands.isEmpty()) throw new NullPointerException("Commands string is null");
        List<String> routeStr = new ArrayList<>();
        String[] stringsArr = commands.split("");
        for (int i = 0; i < stringsArr.length; i++) {
            String str = stringsArr[i];
            if (!map.containsKey(str)) throw new IllegalArgumentException("Incorrect commands");
            routeStr.add(i + 1 + ". " + Command.valueOf(str).getStep());
        }
        return routeStr;
    }
}
