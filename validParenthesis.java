import java.util.Stack;

class validParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }

    public static boolean isValid(String str) {
        char[] arr = str.toCharArray();
        Stack<Character> s = new Stack<Character>();
        if (arr.length == 0)
            return true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[')
                s.push(arr[i]);
            if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']') {
                if (s.isEmpty())
                    return false;
                char tmp = (char) s.pop();
                if (arr[i] == ')' && tmp != '(')
                    return false;
                if (arr[i] == '}' && tmp != '{')
                    return false;
                if (arr[i] == ']' && tmp != '[')
                    return false;
            }
        }
        if (s.isEmpty())
            return true;
        else
            return false;
    }
}