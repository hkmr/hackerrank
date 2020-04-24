class AppendAndDelete {
    public static void main(String[] args) {
        System.out.println(isSame("a", "ab", 2));
    }

    public static boolean isSame(String s, String t, int k) {

        boolean isPossible = false;
        int l1 = s.length(), l2 = t.length();
        int c = 0;
        if (s.equalsIgnoreCase(t) && (k % 2 == 0 || k >= l2 * 2))
            return true;

        if (s.isEmpty() && k % 2 == 0)
            return true;

        for (int i = 0; i < l1; i++) {
            if (i >= l2)
                break;
            if (s.charAt(i) == t.charAt(i)) {
                c++;
            } else {
                break;
            }
        }

        int del = l2 - c;
        int rem = l1 - c;
        int total = del + rem;
        int tmp = k - total;
        if (tmp >= 0)
            return true;

        return isPossible;

    }
}