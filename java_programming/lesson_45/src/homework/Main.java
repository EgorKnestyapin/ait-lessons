package homework;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
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
}
