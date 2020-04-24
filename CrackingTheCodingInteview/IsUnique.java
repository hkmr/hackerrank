/*
 * Is Unique : Implement an algorithm to determine if a string has all unique
 * characters. What if you cannot use additional data strutures?
*/

class IsUnique {

    public static void main(String[] args) {
        System.out.println(isUnique2("abcdfghi"));
    }

    // method one
    public static boolean isUnique1(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            // char ch = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i))
                    return false;
            }
        }
        return true;
    }

    // method two
    public static boolean isUnique2(String str) {
        if (str.length() > 128)
            return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

}