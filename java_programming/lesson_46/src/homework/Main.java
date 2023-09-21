package homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeBetterTrajectory("СЮСЗ"));
        System.out.println(makeBetterTrajectory("СЮВЗ"));
        System.out.println(makeBetterTrajectory("СВЮЗ"));
        System.out.println(makeBetterTrajectory("СВЗЮВЮЗССЮ"));
    }
    /* Предствьте, у вас есть робот, которвй понимает команды:
    'С' - шаг на север
    'Ю' - шаг на юг
    'З' - шаг на запад
    'В' - шаг на восток
    Команды робату поступают в виде строки вида "CЗВЗЗТЮ". Ояквидно, если в строке присутствуют рядом
    взаимопротиваположные команды например "ЗВ" или "СЮ" их можно сократить.
    Очевидно, что после сокращения, в строке опять взаимопротивоположные команды могут оказаться рядом,
    и их опять можно сократить. Например: "СВЮСЗ" превращается в "C" ( "СВЮСЗ" -> "СВЗ" -> "С" ).
    Напишите метод, который оптимизирует строку команд для робота, сокращая лишние шаги.

    Примеры: "СЮСЗ" -> "СЗ"
    "СЮВЗ" -> ""
    "СВЮЗ" -> "СВЮЗ"
    "СВЗЮВЮЗССЮ" -> "ВЮЗС"
     */
    public static String makeBetterTrajectory(String str) {
        Map<Character, Character> map = Map.of(
                'С', 'Ю',
                'Ю', 'С',
                'З', 'В',
                'В', 'З'
        );
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!stack.isEmpty() && map.get(ch).equals(stack.peek())) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        int counter = stack.size();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < counter; i++) {
            res.append(stack.pop());
        }
        res.reverse();
        return res.toString();
    }
}
