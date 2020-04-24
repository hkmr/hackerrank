class Leet38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(1));
    }

    public static String countAndSay(int n) {

        String res = "1";
        // since we are starting with the first element
        n = n - 1;

        while (n-- > 0) {
            int len = res.length();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < len;) {
                int j = i + 1;
                // Find the index of the first character that is not the same as i
                for (; j < len && (res.charAt(i) == res.charAt(j)); j++) {
                }
                // find the number of elements from i to j(j not included) and append it to sb
                sb.append(j - i);
                // now append the actual character itself
                sb.append(res.charAt(i));
                i = j;
            }
            res = sb.toString();
        }

        return res;
    }
}