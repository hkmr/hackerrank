class LongestSubstring {

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(longest(str));
    }

    public static int longest(String s) {
        char arr[] = s.toCharArray();
        int len = arr.length;
        String sub = null;
        int grt = 0;

        for (int i = 0; i < len; i++) {
            sub = Character.toString(arr[i]);
            int count = 1;
            for (int j = i + 1; j < len; j++) {
                if (check(sub, arr[j])) {
                    count++;
                    sub = sub + Character.toString(arr[j]);
                } else {
                    break;
                }
            }
            if (count > grt) {
                grt = count;
            }
        }

        return grt;
    }

    public static boolean check(String s, char c) {
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (s.charAt(i) == c)
                return false;
        }
        return true;
    }

}