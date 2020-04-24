class AlternatingCharacter {
    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAABBB"));
    }

    public static int alternatingCharacters(String str) {

        int cost = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i))
                cost++;
        }

        return cost;

    }
}