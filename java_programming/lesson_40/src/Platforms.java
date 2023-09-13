import java.util.Collections;
import java.util.List;

public class Platforms {
    /* Написать метод, находящий минимальное количество платформ, требуемых на ж/д станции, чтобы принять количество
    поездов по расписанию. Есть время прибытия и отправления поездов.
    List arrival [1:00, 1:40, 1:50, 2:00, 2:15, 4:00]
    List departure [1:10, 3:00, 2:20, 2:30, 3:15, 6:00]
     */
    public static int findPlatformsNumber(List<Integer> arrival, List<Integer> departure) {
        Collections.sort(arrival);
        Collections.sort(departure);
        int neededPlatforms = 0;
        int maxPlatforms = 0;
        int i = 0;
        int j = 0;
        while (i < arrival.size() && j < departure.size()) {
            if (arrival.get(i) < departure.get(j)) {
                neededPlatforms++;
                i++;
                if (neededPlatforms > maxPlatforms) {
                    maxPlatforms = neededPlatforms;
                }
            } else {
                neededPlatforms--;
                j++;
            }
        }
        return maxPlatforms;
    }
}
