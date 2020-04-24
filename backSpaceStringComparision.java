import java.util.Arrays;
import java.util.Stack;

class Backspace {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("abcd", "bbcd"));
    }

    public static boolean backspaceCompare(String s1, String s2) {

        Stack<Character> st1 = new Stack<Character>();
        Stack<Character> st2 = new Stack<Character>();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c != '#') {
                st1.push(c);
            } else {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (c != '#') {
                st2.push(c);
            } else {
                if (!st2.isEmpty()) {
                    st2.pop();
                }
            }
        }

        if (st1.size() != st2.size())
            return false;

        while (!st1.isEmpty()) {
            // System.out.println(st1.pop() + " - " + st2.pop());
            if (st1.pop() != st2.pop())
                return false;
        }

        return true;

    }
}