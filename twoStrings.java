class TwoStrings {
    public static void main(String[] args) {
        System.out.println(isCommon("hi", "world"));
    }

    public static String isCommon(String s1, String s2) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < letters.length(); i++) {
            if (s1.contains("" + letters.charAt(i)) && s2.contains("" + letters.charAt(i)))
                return "YES";
        }

        return "NO";
    }
}