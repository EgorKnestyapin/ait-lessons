package homework;

import java.util.*;

public class Main {
    public static Map<Character, Character> pairToOpenBracket = Map.of(
            '[', ']',
            '{', '}',
            '(', ')'
    );
    public static Set<Character> pairToCloseBracket = new HashSet<>(pairToOpenBracket.values());

    public static void main(String[] args) {
        String seq1 = "( {} [] )";
        String seq2 = "( {} [ )";
        String seq3 = "( } [] )";
        String seq4 = "{ ( } [] )";
        System.out.println(isBracketSequenceRight(seq1));
        System.out.println(isBracketSequenceRight(seq2));
        System.out.println(isBracketSequenceRight(seq3));
        System.out.println(isBracketSequenceRight(seq4));
    }

    /* ** Задача 1 **
    Дана строка - скобочная последовательность ( строка состоящая из скобок трех видов *() [] {} ).
    Написать метод (алгоритм обсуждали в классе) который проверит правильность расстановки скобок.
    ( {} [] ) -> true
    ( {} [ ) -> false
    ( } [] ) -> false
    { ( } [] ) -> false
     */
    public static boolean isBracketSequenceRight(String sequence) {
        if (sequence == null) return false;
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < sequence.length(); i++) {
            char ch = sequence.charAt(i);
            if (ch == ' ') {
            } else if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == stack.pop()) {
            } else {
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean checkBrackets1(String str) {
        Deque<Character> stack = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            Character bracket = pairToOpenBracket.get(ch);
            if (bracket != null) {
                stack.push(bracket);
            } else if (!pairToCloseBracket.contains(ch) && (stack.isEmpty() || ch != stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean checkBrackets2(String bracketStr) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        Deque<Character> stack = new LinkedList<>();
        for (Character c : bracketStr.toCharArray()) {
            if (c == ' ') continue;
            if (brackets.containsValue(c)) {
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
